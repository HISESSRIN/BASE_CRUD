package Tablota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class DataTest {

	@Test
	void testInsertarEMP() {
		
		EMP c=new EMP(6,"a","a","a","a","a","a","a","a","a","a");
		assertTrue(c.insertarEMP());
	}
	@Test
void testCargarEMP() {
		
		EMP c=new EMP(3,"a","a","a","a","a","a","a","a","a","a");
		assertTrue(c.cargarEMP());
		
	}
	@Test
void testEliminarEMP() {
	
	EMP c=new EMP(2,"a","a","a","a","a","a","a","a","a","a");
	assertTrue(c.eliminarEMP());
}
	@Test
void testEditarEMP() {
	
	EMP c=new EMP(4,"a","a","a","a","a","a","a","a","a","a");
	assertTrue(c.editarEMP());
}



}
