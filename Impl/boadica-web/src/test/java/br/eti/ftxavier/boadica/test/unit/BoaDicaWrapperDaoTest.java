package br.eti.ftxavier.boadica.test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.eti.ftxavier.boadica.dao.BoaDicaWrapperDao;
import br.eti.ftxavier.boadica.model.Fabricante;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath*:beans/application-context-test.xml", "classpath*:beans/data-context-test.xml" } )
public class BoaDicaWrapperDaoTest {
	
	@Autowired
	private BoaDicaWrapperDao boaDicaWrapperDao;
	
	@Test
	public void getProductList() {
		List<Fabricante> manufacturersList = boaDicaWrapperDao.getManufacturers();
		assertNotNull(manufacturersList);
		assertEquals(2369, manufacturersList.size());
	}
}
