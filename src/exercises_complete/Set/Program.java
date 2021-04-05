package exercises_complete.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();
		
		
		System.out.print("How many students for course A?");
		int x = sc.nextInt();
		for(int i=0;i<x;i++) {
			int p = sc.nextInt();
			A.add(p);
		}
		System.out.print("How many students for course B?");
		x = sc.nextInt();
		for(int i=0;i<x;i++) {
			int p = sc.nextInt();
			B.add(p);
		}
		System.out.print("How many students for course C?");
		x = sc.nextInt();
		for(int i=0;i<x;i++) {
			int p = sc.nextInt();
			C.add(p);
		}
		
		Set<Integer> D = new TreeSet<>(A);
		D.addAll(B);
		D.addAll(C);
		
		System.out.println("Total students: " + D.size());
		
		sc.close();
	}
	
}
