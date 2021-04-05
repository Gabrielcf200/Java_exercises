package exercises_complete.ProjectDaoSellerDepartment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;

public class DepartmentDaoJDBC implements DepartmentDao {
	private Connection conn;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement("INSERT INTO department (Id, Name) VALUES (? , ?)", Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getId());
			st.setString(2, obj.getName());
			
			st.executeUpdate();
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);}
	}

	@Override
	public void update(Department obj) {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?");
			st.setString(1, obj.getName());
			st.setInt(2, obj.getId());
			
			st.executeUpdate();
					
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
			st.setInt(1, id);
			st.executeUpdate();
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
	}
	

	@Override
	public Department findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement("SELECT * FROM coursejdbc.department WHERE Id = ?");
			st.setInt(1, id);
			
			rs = st.executeQuery();
			if (rs.next()){
				Department department = new Department();
				department.setId(rs.getInt("Id"));
				department.setName(rs.getString("Name"));
				return department;
			}
			return null;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	}

	@Override
	public List<Department> findAll() {
		PreparedStatement st = null;
		ResultSet rs =  null;
		try {
			List<Department> list = new ArrayList<>();
			st = conn.prepareStatement("SELECT * FROM coursejdbc.department");
			rs = st.executeQuery();
			
			while(rs.next()){
				list.add(new Department(rs.getInt("Id"), rs.getString("Name")));
			}
			return list;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	}

}
