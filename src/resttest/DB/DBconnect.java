package resttest.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class DBconnect {

	public final static String USERNAME = "root";
	public static final String PASSWORD = "jxv6";
	public static final String DB_path = "jdbc:mysql://localhost:3306/test";
	
	public static Connection connect(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in Database Connection"+e.getMessage());
		}
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(DB_path,USERNAME,PASSWORD);
			System.out.println("connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in Database Connection1"+e.getMessage());
		}
		
		return con;}
	
	public static void closeconnections(PreparedStatement ps, ResultSet rs,Connection con){
		try {
			if(ps != null){
				
					ps.close();
				}
			if(rs != null){
				
				rs.close();
			}
			if(con != null){
				
				con.close();
			}
			}
			catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

public static void main(String[] args){
	
	DBconnect.connect();
}

}
