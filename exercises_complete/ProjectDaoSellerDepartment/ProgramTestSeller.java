package exercises_complete.ProjectDaoSellerDepartment;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramTestSeller {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: SELLER findById===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		System.out.println("\n=== TEST 2: SELLER findByDepartment===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== TEST 3: SELLER findAll===");
		List<Seller> list2 = sellerDao.findAll();
		
		for(Seller obj: list2) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: SELLER INSERT===");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: SELLER UPDATE===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: SELLER DELETE===");
		System.out.println("Enter id for delete test: ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Completed! ");
	
		
	
		sc.close();
	}
}
