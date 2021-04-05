package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgramSql4 {
	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			
			
			st = conn.createStatement();
			
			int rowns1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId =1");
			//if (true) {
				//throw new DbException("Fake error");
			//}
			int rowns2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId =2");
			
			conn.commit();
		
			System.out.println(rowns1 + ", " + rowns2);

		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro trying to rollback! Caused by: " + e1.getMessage());
			}
		} finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}
	}
}
