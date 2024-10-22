package second_CrudCertificacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataCelular {
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
		DataCelular dc = new DataCelular();
		dc.conectar();
	}

	public boolean insertarCelular(Celular c) {

		PreparedStatement ps;
		try {

			ps = conectar().prepareStatement("INSERT INTO celular VALUES(?,?,?,?)");
			ps.setInt(1, c.getId());
			ps.setString(2, c.getMarca());
			ps.setString(3, c.getModelo());
			ps.setString(4, c.getCosto());
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO: handle exception
			return false;
		}

	} 

	public boolean cargarCelular(Celular c) {
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = conectar().prepareStatement("SELECT * FROM celular WHERE idcelular=?");
			ps.setInt(1, c.getId());
			rs = ps.executeQuery();
			if (rs.next()) {
				c.setMarca(rs.getString(2));
				c.setModelo(rs.getString(3));
				c.setCosto(rs.getString(4));

				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {

			return false;

		}

	}

	public boolean editarCelular(Celular c) {
		// TODO Auto-generated method stub

		PreparedStatement ps;
		try {

			ps = conectar().prepareStatement("UPDATE celular SET marca=?,modelo=?,costo=? WHERE idcelular=?");
			ps.setString(1, c.getMarca());
			ps.setString(2, c.getModelo());
			ps.setString(3, c.getCosto());
			ps.setInt(4, c.getId());
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO: handle exception
			return false;
		}

	}

	public boolean eliminarCelular(int idcel) {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		try {

			ps = conectar().prepareStatement("DELETE FROM celular WHERE idcelular=?");

			ps.setInt(1, idcel);
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO: handle exception
			return false;
		}

	}
	public ArrayList<Celular> lista(){
		ArrayList<Celular> listaCel = new ArrayList<Celular>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conectar().prepareStatement("SELECT * FROM celular");
			rs = ps.executeQuery();
			while(rs.next()) {
				Celular c = new Celular();
				c.setId(rs.getInt("idCelular"));
				c.setMarca(rs.getString("marca"));
				c.setModelo(rs.getString("modelo"));
				c.setCosto(rs.getString("costo"));
				listaCel.add(c);
			}
			ps.close();
			ps = null;
			System.out.println("SE CARGO LA LISTA");
		} catch (SQLException e) {
			System.out.println("ERROR AL CARGAR LA LISTA");
		}
		return listaCel;
		
	}

}