package Celular;

public class celular {
String marca;
String modelo;
String color;
String procesador;
int ram;
public celular() {

}
public celular(String marca, String modelo, String color, String procesador, int ram) {

	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.procesador = procesador;
	this.ram = ram;
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
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getProcesador() {
	return procesador;
}
public void setProcesador(String procesador) {
	this.procesador = procesador;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
@Override
public String toString() {
	return "celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", procesador=" + procesador
			+ ", ram=" + ram + "]";
}

}
