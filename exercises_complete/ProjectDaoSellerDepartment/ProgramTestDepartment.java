package exercises_complete.ProjectDaoSellerDepartment;


public class ProgramTestDepartment {
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: Department INSERT===");
		Department newDepartment = new Department(11,"School");
	
		departmentDao.insert(newDepartment);
		
		System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 2: DEPARTMENT UPDATE===");
		departmentDao.update(new Department(10, "Tools"));;
		System.out.println("Update Complete!");
		
		System.out.println("\n=== TEST 3: DEPARTMENT DELETE===");
		departmentDao.deleteById(11);
		System.out.println("Delete Complete!");
		
		System.out.println("\n=== TEST 4: DEPARTMENT FINDBYID===");
		Department department = departmentDao.findById(10);
		System.out.println(department);
		
		System.out.println("\n=== TEST 5: DEPARTMENT FINDAll===");
		System.out.println(departmentDao.findAll());
		
		
		
	}
}
