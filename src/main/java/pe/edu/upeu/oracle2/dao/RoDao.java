package pe.edu.upeu.oracle2.dao;

import java.util.List;


import pe.edu.upeu.oracle2.entity.Rol;

public interface RoDao {
	public int create(Rol r);
	
	public List<Rol> readAll();
}
