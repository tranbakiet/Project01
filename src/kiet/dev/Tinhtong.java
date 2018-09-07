package kiet.dev;

import java.util.Scanner;

public class Tinhtong {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		int tong = 0;
        System.out.println("Nhap vao so nguyen duong :");
        scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
        	tong = tong + i;
        }
        System.out.println("Tong cac chu so la: " +tong);
	}
}
