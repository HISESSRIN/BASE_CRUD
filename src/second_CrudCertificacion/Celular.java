package second_CrudCertificacion;



public class Celular {
int id;
String marca,modelo,costo;

DataCelular dc=new DataCelular();
public boolean insertarCelular() {
	return dc.insertarCelular(this);
	
}
public boolean cargarCelular() {
	return dc.cargarCelular(this);
}
public boolean editarCelular() {
	return dc.editarCelular(this);
}
public boolean eliminarCelular() {
	return dc.eliminarCelular(this.getId());
}






public Celular() {

}
public Celular(int id, String marca, String modelo, String costo) {

	this.id = id;
	this.marca = marca;
	this.modelo = modelo;
	this.costo = costo;
}
public Celular( String marca, String modelo, String costo) {

	this.id = id;
	this.marca = marca;
	this.modelo = modelo;
	this.costo = costo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getCosto() {
	return costo;
}
public void setCosto(String costo) {
	this.costo = costo;
}





}