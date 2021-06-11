package pe.edu.upeu.oracle2.entity;

public class Rol {
	private int idalumno;
	private String nombres;
	private String telefono;
	private String correo;
	public int getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Rol() {

	}
	public Rol( String nombres, String telefono, String correo) {
		this.nombres = nombres;
		this.telefono = telefono;
		this.correo = correo;
	}
	


}
