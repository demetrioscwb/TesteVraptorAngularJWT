package br.com.objetivo.session;


import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.objetivo.model.Usuario;

@RequestScoped
@Component
public class UsuarioLogado {
	
	 private Usuario usuario;

	    protected UsuarioLogado() {
	    }

	    /**
	     * Salva os dados necessarios para a sessão
	     *
	     * @param usuario dados do usuario logado
	     * @param telas
	     */
	    public void logar(Usuario usuario) {
	        this.usuario = usuario;
	    }

	    /**
	     * Remove os dados de login da sessão
	     */
	    public void logout() {
	        this.usuario = null;
	    }


	    public boolean isLogado() {
	        return usuario != null;
	    }

	    public Usuario getUsuario() {
	        return usuario;
	    }
}

