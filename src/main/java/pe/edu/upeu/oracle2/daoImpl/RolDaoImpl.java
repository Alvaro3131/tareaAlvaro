package pe.edu.upeu.oracle2.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import pe.edu.upeu.oracle2.config.Conexion;
import pe.edu.upeu.oracle2.dao.RoDao;
import pe.edu.upeu.oracle2.entity.Rol;

public class RolDaoImpl implements RoDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Rol r) {
		int x = 0;
		String SQL = "insert into alumno (idalumno, nombres, telefono, correo) values(null, ?, ?, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, r.getNombres());
			ps.setString(2, r.getTelefono());
			ps.setString(3, r.getCorreo());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}



	@Override
	public List<Rol> readAll() {
	
			// TODO Auto-generated method stub
			List<Rol> lista = new ArrayList<>();
			String SQL = "select * from alumno";
			try {
				cx = Conexion.getConexion();
				ps = cx.prepareStatement(SQL);
				rs = ps.executeQuery();
				while (rs.next()) {
					Rol a = new Rol();
					a.setIdalumno(rs.getInt("idalumno"));
					a.setNombres(rs.getString("nombres"));
					a.setTelefono(rs.getString("telefono"));
					a.setCorreo(rs.getString("correo"));
					lista.add(a);
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			return lista;
}

}
