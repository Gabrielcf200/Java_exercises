package exercises_complete.Matriz;

import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		int C, L, X;
		
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		C = sc.nextInt();
	
		int[][] matriz = new int[L][C];
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0;j< matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}	
		System.out.println("Digite um número da matriz: ");
		X = sc.nextInt();
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0;j < matriz[i].length; j++) {
				if (matriz[i][j] == X) {
					System.out.println("Posição " + i + ", " + j);				
					if (j - 1 >= 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if ( j + 1 < matriz[i].length) {
						System.out.println("Right: " + matriz[i][j + 1]);	
					}
					
					if (i - 1 >= 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (i + 1 < matriz.length) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();		
	}

}
