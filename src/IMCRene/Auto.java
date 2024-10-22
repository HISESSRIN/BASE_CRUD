package IMCRene;

public class Auto {
String marca;
double modelo;
String anio;
String color;
String placa;
String precio;
public Auto() {
	
}
public Auto(String marca,double modelo1, String anio, String color, String placa,String precio) {
	super();
	this.marca = marca;
	this.modelo = modelo1;
	this.anio = anio;
	this.color = color;
	this.placa = placa;
	this.precio=precio;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public double getModelo() {
	return modelo;
}
public void setModelo(double modelo) {
	this.modelo = modelo;
}
public String getAnio() {
	return anio;
}
public void setAnio(String anio) {
	this.anio = anio;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getPrecio() {
	return precio;

}
public void setPrecio(String precio) {
	this.precio = precio;
}




}
