package br.com.objetivo.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.objetivo.session.UsuarioLogado;

@Resource
@Path("/cadastro")
public class CadastroController {	
	
	private Result result;	
	private UsuarioLogado usuarioLogado;	
	
	public CadastroController(Result result,  UsuarioLogado usuarioLogado) {		
		
		this.result = result;
		
	}
	
	@Get("/possuiAcesso")
	public void list() {
		System.out.println("bara bara bara bere bere!!!!");
		result.nothing();// Qdo não tem nenhum retorno
	}


	
	
	

}
