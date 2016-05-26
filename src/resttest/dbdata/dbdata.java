package resttest.dbdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import resttest.DB.DBconnect;
import resttest.exception.appexception;
import resttest.models.personall;

public class dbdata {

	
	public List<personall> getall() throws appexception{
		List<personall> peoplelist = new ArrayList<personall>();
		Connection con = DBconnect.connect();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select * from test1");
			rs = ps.executeQuery();
			
			while(rs.next()){
				personall person = new personall();
				person.setId(rs.getInt("id"));
				person.setName(rs.getString("Name"));
				person.setCity(rs.getString("city"));
				
				peoplelist.add(person);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new appexception(e.getMessage(),e.getCause());
		}
		
		finally{
			
			DBconnect.closeconnections(ps, rs, con);
			}
			
		
		return peoplelist;
	}
	
	
	public personall getone(int personid) throws appexception{
		personall person = new personall();
		Connection con = DBconnect.connect();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("select * from test1 WHERE id =?");
			ps.setInt(1, personid);
			rs = ps.executeQuery();
			
			if(rs.next()){
				person.setId(rs.getInt("id"));
				person.setName(rs.getString("Name"));
				person.setCity(rs.getString("city"));
				
				
			}
			else{
				throw new appexception("Id not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new appexception(e.getMessage(),e.getCause());
		}
		
		finally{
			
			DBconnect.closeconnections(ps, rs, con);
			}
			
		
		return person;
	}
	
	
	public personall addone(personall person) throws appexception{
		//personall person = new personall();
		Connection con = DBconnect.connect();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement("INSERT INTO test1 (Name,city) VALUES (?,?)", PreparedStatement.RETURN_GENERATED_KEYS );
			ps.setString(1,person.getName());
			ps.setString(2,person.getCity());
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			
			if(rs.next()){
				person.setId(rs.getInt(1));	
			}
			else{
				throw new appexception("Id not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new appexception(e.getMessage(),e.getCause());
		}
		
		finally{
			
			DBconnect.closeconnections(ps, rs, con);
			}
			
		
		return person;
	}
	
}
