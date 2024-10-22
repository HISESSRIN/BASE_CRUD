package Tiendita;

public class Almacen {

	String producto;
	String precio;
	String categoria;
	String proveedor;
	public Almacen() {
	
	}
	public Almacen(String producto, String precio, String categoria, String proveedor) {
		super();
		this.producto = producto;
		this.precio = precio;
		this.categoria = categoria;
		this.proveedor = proveedor;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
	
	
	
	
	
	
	
}
