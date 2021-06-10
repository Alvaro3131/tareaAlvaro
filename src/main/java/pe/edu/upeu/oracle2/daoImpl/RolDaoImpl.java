package pe.edu.upeu.oracle2.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upeu.oracle2.dao.RoDao;
import pe.edu.upeu.oracle2.entity.Rol;

public class RolDaoImpl implements RoDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		List<Rol> lista = new ArrayList<>();
		String SQL = "select *from rol";
		
		
		return lista;
	}

}
