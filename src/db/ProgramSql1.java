package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ProgramSql1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement stt = null;
		
		try {
			conn = DB.getConnection();
			
			stt = conn.prepareStatement(
					"INSERT INTO seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentID)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
		
			stt.setString(1, "Carl Purple");
			stt.setString(2, "carl@gmail.com");
			stt.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			stt.setDouble(4, 3000);
			stt.setInt(5, 4);
			
			st = conn.prepareStatement("INSERT INTO department(Name) VALUES ('D1'),('D2')", Statement.RETURN_GENERATED_KEYS);
			

			
			int rowsAffected = stt.executeUpdate();
			
			if(rowsAffected > 0) {
				rs = stt.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			}else {
				System.out.println("No rown affected!");
			}
			
			st = conn.createStatement();
			rs = st.executeQuery("select * from department");

			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}catch(SQLException | ParseException e) {e.getStackTrace();}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);	
			DB.closeStatement(stt);
			DB.closeConnection();
		}
	}

}
