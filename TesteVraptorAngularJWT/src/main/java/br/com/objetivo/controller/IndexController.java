package br.com.objetivo.controller;

import javax.servlet.http.HttpSession;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.objetivo.model.Index;
import br.com.objetivo.model.Usuario;
import br.com.objetivo.security.JWTUtil;
import br.com.objetivo.session.UsuarioLogado;

@Resource
public class IndexController{
		
	private Result result;
	
	private UsuarioLogado usuarioLogado;
	
	private final HttpSession session;
	
	public IndexController(Result result,  UsuarioLogado usuarioLogado, HttpSession session) {
		
		this.usuarioLogado = usuarioLogado;
		this.result = result;
		this.session = session;
		

	}
		
	@Get("/users")
	public void list() {
		
		Usuario usuario = new Usuario();
		usuario.setNome("testeTTTT");		
		usuarioLogado.logar(usuario);
		
		session.setAttribute("token", JWTUtil.createToken("testeTTTT", "adm"));
		
		System.out.println("bara bara bara bere bere!!!!");
		result.nothing();// Qdo não tem nenhum retorno
	}
	
	@Get("/usersMsg")
	public void listComRetorno() {
		System.out.println("bara bara bara bere bere com retorno!!!!");
		
		Index ix = new Index();
		ix.setMsg("essa msg veio do java");
		
		result.use(Results.json()).from(ix).serialize();
	}
	

	@Post("/usersPost")
	@Consumes("application/json")
	public void create(Index index) {
		
		System.out.println("chegouuuu post...");

		System.out.println("mesnsagem ---->"+index.getMsg());
		
		result.nothing();
	}
	

}
