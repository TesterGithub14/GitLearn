package helloworld;

import java.io.*;
import java.util.*;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("Nhap so nguyen x: ");
		x = sc.nextInt();
		System.out.print("Nhap so nguyen y: ");
		y = sc.nextInt();
		int tong = x + y;
		int hieu = x - y;
		int tich = x * y;
		double thuong = (double)x/y;
		
		System.out.print("Tong: " + tong);
		System.out.print("Hieu: " + hieu);
		System.out.print("Tich: "+ tich);
		System.out.print("Thuong: " + thuong);
	}
	
}
