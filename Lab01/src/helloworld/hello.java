package helloworld;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class hello {
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien:");
        String masv=x.nextLine();
        System.out.print("Nhap ho va ten sinh vien:");
        String hoten=x.nextLine();
        System.out.print("Nhap tuoi:");
        Byte tuoi=x.nextByte();
        System.out.print("Nhap ngay thang nam sinh:");
        int namsinh=x.nextInt();
        System.out.print("Nhap diem trung binh:");
        double diemTB=x.nextDouble();
	}
}
