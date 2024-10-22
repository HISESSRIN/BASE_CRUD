package second.login;



public class Usuario {
int id;
String nombre,email,password;
DataUsuario dc=new DataUsuario();
public boolean insertarUsuario() {
	return dc.insertarUsuario(this);
	
}
public boolean cargarUsuario() {
	return dc.cargarUsuario(this);
	
}
public Usuario() {

}
public Usuario(int id, String nombre, String email, String password) {
	
	this.id = id;
	this.nombre = nombre;
	this.email = email;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}







}
