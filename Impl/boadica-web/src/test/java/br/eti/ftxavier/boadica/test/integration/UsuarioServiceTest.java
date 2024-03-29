package br.eti.ftxavier.boadica.test.integration;

import static org.junit.Assert.assertNotNull;
import static org.springframework.util.Assert.notEmpty;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.eti.ftxavier.boadica.model.Usuario;
import br.eti.ftxavier.boadica.service.UsuarioService;
import br.eti.ftxavier.boadica.test.util.TestUtil;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath*:beans/application-context-test.xml", "classpath*:beans/data-context-test.xml" } )
public class UsuarioServiceTest {
	
	@Autowired
	private UsuarioService usuarioService;
		
	@Test
	public void save() {
		Usuario usuario = TestUtil.getUsuario("usuariosave");
		usuarioService.save(usuario);
		assertNotNull(usuario.getId());
	}
	
	@Test
	public void list() {
		save();
		List<Usuario> lista = usuarioService.list();
		notEmpty(lista);
	}
	
	@Test
	public void findByLogin() {
		Usuario usuario = TestUtil.getUsuario("ftxavier");
		usuarioService.save(usuario);
		Usuario usuarioSalvo = usuarioService.getUsuarioByLogin("ftxavier");
		assertNotNull(usuarioSalvo);
	}

}
