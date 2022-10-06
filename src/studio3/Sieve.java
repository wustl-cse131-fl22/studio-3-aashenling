package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		int n;
		int composite;
		int prime;
		Scanner in = new Scanner(System.in);
		System.out.print("Input value for n: ");
		n = in.nextInt();
		
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = (i + 1);
			//System.out.print(num[i] + " ");
		for (int j = 2; j < n; j++) {
			for (int multiple = 2; multiple < (n+1); multiple++) {
				composite = j * multiple;
				
				}
			}
		}
	}
}