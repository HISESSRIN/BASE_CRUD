package second_CrudCertificacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataCelularTest {

	@Test
	void testInsertarCelular() {
		
		Celular c=new Celular(211,"a","a","a");
		assertTrue(c.insertarCelular());
	}
	@Test
	void testCargarCelular() {
		
		Celular c=new Celular(1,"a","a","a");
		assertTrue(c.cargarCelular());
	}
	@Test
	void testEditarCelular() {
		
		Celular c=new Celular(207,"a","a","a");
		assertTrue(c.editarCelular());
	}
	@Test
	void testEliminarCelular() {
		
		Celular c=new Celular(19,"a","a","a");
		assertTrue(c.eliminarCelular());
	}

}
