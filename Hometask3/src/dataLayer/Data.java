package dataLayer;
import java.sql.*;
public class Data {
	static String url="jdbc:oracle:thin:@localhost:1521:xe";
	static String name="system";
	static String password="password";
	public void dat(int a,int b,int c,String s) {
	
	try {
	DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
	
	Connection con=DriverManager.getConnection(url,name,password);
	PreparedStatement ps1=con.prepareStatement("insert into "+s+" values(?,?,?) ");
	ps1.setInt(1,a);
	ps1.setInt(2,b);
	ps1.setInt(3,c);
	ps1.executeUpdate();
	ps1.close();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
