package Tablota;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import second_CrudCertificacion.Celular;



public class Data {
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
		Data dc = new Data();
		dc.conectar();
	}

	public boolean insertarEMP(EMP c) {

		PreparedStatement ps;
		try {

			ps = conectar().prepareStatement("INSERT INTO brocoly VALUES(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setLong(1, c.getCustomerid());
			ps.setString(2, c.getCompanyName());
			ps.setString(3, c.getContactTitle());
			ps.setString(4, c.getContactName());
			ps.setString(5, c.getAddress());
			ps.setString(6, c.getCity());
			ps.setString(7, c.getRegion());
			ps.setString(8, c.getPostalCode());
			ps.setString(9, c.getCountry());
			ps.setString(10, c.getPhone());
			ps.setString(11, c.getFax());

			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO: handle exception
			return false;
		}

	}

	public boolean eliminarEMP(int idcel) {
		// TODO Auto-generated method stub
		

		PreparedStatement ps;
		try {

			ps = conectar().prepareStatement("DELETE FROM brocoly WHERE customerid=?");

			ps.setInt(1, idcel);
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO: handle exception
			return false;
		}
		
	}
	public boolean cargarEMP(EMP c) {
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = conectar().prepareStatement("SELECT * FROM brocoly WHERE customerid=?");
			ps.setInt(1, c.getCustomerid());
			rs = ps.executeQuery();
			if (rs.next()) {
				c.setCompanyName(rs.getString(2));
				c.setContactTitle(rs.getString(3));
				c.setContactName(rs.getString(4));
				c.setAddress(rs.getString(5));
				c.setCity(rs.getString(6));
				c.setRegion(rs.getString(7));
				c.setPostalCode(rs.getString(8));
				c.setCountry(rs.getString(9));
				c.setPhone(rs.getString(10));
				c.setFax(rs.getString(11));
				return true;
			} else {
				return false;
			}

		} catch (Exception e2) {

			return false;

		}

	}
	public boolean editarEMP(EMP c) {
		// TODO Auto-generated method stub

		PreparedStatement ps;
		try {

			ps = conectar().prepareStatement("UPDATE brocoly SET companyname=?,contacttitle=?,contactname=?,address=?,city=?,region=?,postalcode=?,country=?,phone=?,fax=? WHERE customerid=?");
	
			
			ps.setString(1, c.getCompanyName());
			ps.setString(2, c.getContactTitle());
			ps.setString(3, c.getContactName());
			ps.setString(4, c.getAddress());
			ps.setString(5, c.getCity());
			ps.setString(6, c.getRegion());
			ps.setString(7, c.getPostalCode());
			ps.setString(8, c.getCountry());
			ps.setString(9, c.getPhone());
			ps.setString(10, c.getFax());
			ps.setInt(11,c.getCustomerid() );
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			// TODO: handle exception
			return false;
		}

	}
	

}
