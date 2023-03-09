package helloworld;

import java.io.*;
import java.util.*;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Nhap so nguyen duong a: ");
		a = sc.nextInt();
		System.out.print("Nhap so nguyen duong b: ");
		b = sc.nextInt();
		int uscln = timUSCLN(a, b);
		int bscnn = a*b/uscln;
		System.out.print("USCLN la: " + a + "," + b + uscln);
		System.out.print("BSCNN cua: " +a+ "," +b+ "la" +bscnn);
	}
	public static int timUSCLN(int a, int b) {
		while(b != 0)
		{
			int r=a%b;
			a = b;
			b = r;
		}return a;
	}
}
