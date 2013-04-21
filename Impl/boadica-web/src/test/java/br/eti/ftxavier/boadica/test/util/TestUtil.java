package br.eti.ftxavier.boadica.test.util;

import br.eti.ftxavier.boadica.model.Usuario;

public class TestUtil {

	public static Usuario getUsuario(String login) {
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setNome("Nome");
		usuario.setSenha("senha");
		return usuario;
	}
}
