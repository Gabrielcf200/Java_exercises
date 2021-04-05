package exercises_complete.ProjectDaoSellerDepartment;

import db.DB;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartmentDaoJDBC createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
