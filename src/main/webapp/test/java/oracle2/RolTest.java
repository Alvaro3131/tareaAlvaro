package oracle2;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upeu.oracle2.dao.RoDao;
import pe.edu.upeu.oracle2.daoImpl.RolDaoImpl;
import pe.edu.upeu.oracle2.entity.Rol;

public class RolTest {
	private RoDao rdo;
	
	@Before
	public void before() {
		rdo = new RolDaoImpl();
	}
	@Test
	public void test() {
			//List<Rol> lista = rdo.readAll();
			// System.out.println(lista.get(0).getNomrol());
			//assertEquals("Finanzas", lista.get(0).getNomrol());
			
			//assertEquals(1, rdo.create(new Rol("Pokemon", 1)));
			Rol r = new Rol();
		    r.setIdrol(1);
			r.setNomrol("Vendedor1");
			r.setEstado(0);
		     assertEquals(1, rdo.update(r));
			
		//	assertEquals(1, rdo.delete(215));
	}

}
