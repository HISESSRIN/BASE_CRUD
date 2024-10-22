package second.login;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DataUsuario {
	Connection cx = null;

	public Connection conectar() {
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost/304", "root", "");
			System.out.println("conexion exitosa");
		} catch (SQLException e) {

			System.out.println("error");
			e.printStackTrace();
		}
		return cx;
	}

	public static void main(String[] cecyto) {
		DataUsuario dc = new DataUsuario();
		dc.conectar();
	}
	
	
	public boolean insertarUsuario(Usuario c) {

		PreparedStatement ps;
		try {

			ps = conectar().prepareStatement("INSERT INTO usuario VALUES(0,?,?,?)");
			
			ps.setString(2, c.getNombre());
			ps.setString(1, c.getEmail());
			ps.setString(3, convertirSHA256(c.getPassword()));
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO: handle exception
			return false;
		}

	} 
	
	
	
	
	
	public String convertirSHA256(String password) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} 
		catch (NoSuchAlgorithmException e) {		
			e.printStackTrace();
			return null;
		}
		    
		byte[] hash = md.digest(password.getBytes());
		StringBuffer sb = new StringBuffer();
		    
		for(byte b : hash) {        
			sb.append(String.format("%02x", b));
		}
		    
		return sb.toString();
	}
	public boolean cargarUsuario (Usuario u) {
		PreparedStatement ps;
		ResultSet rs;
		try {
		ps = conectar().prepareStatement("SELECT * FROM usuario WHERE email=?");
		ps.setString(1, u.getEmail());
		rs = ps.executeQuery();
		if (rs.next()) {
		return true;
		} else {
		return false;
		}
		} catch (SQLException e) {
		return false;
		
		}
		}

}
