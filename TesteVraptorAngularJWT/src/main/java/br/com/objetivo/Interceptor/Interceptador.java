package br.com.objetivo.Interceptor;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Map;

import javax.servlet.http.HttpSession;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.caelum.vraptor.view.Results;
import br.com.objetivo.security.JWTUtil;

import com.auth0.jwt.JWTVerifyException;

@Intercepts
@RequestScoped
public class Interceptador implements Interceptor{
	
	private final HttpSession session;	
	private Result result;	
	
	public Interceptador(HttpSession session, Result result) {		
				
		this.session = session;	
		this.result = result;

		
	}

	@Override
	public void intercept(InterceptorStack stack, ResourceMethod method,
			Object resourceInstance) throws InterceptionException {
		
		//this.result.use(Results.http()).sendError(HttpServletResponse.SC_FORBIDDEN);
		result.use(Results.http()).sendError(403, "O usuário não está autorizado a realizar essa operação");
	     
		
		
	}

	@Override
	public boolean accepts(ResourceMethod method) {

		if(method.getResource().getType().getName() == "br.com.objetivo.controller.IndexController")
			return false;
		
		try {

			Map<String, Object> claims;
			
			String token = (String) this.session.getAttribute("token");
			
			claims = JWTUtil.decode(token);
			
		}catch (InvalidKeyException | NoSuchAlgorithmException
				| IllegalStateException | SignatureException | IOException
				| JWTVerifyException e) {
			
			return false;

		}
		
		return true;
	}

}
