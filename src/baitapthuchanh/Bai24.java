/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a=scan.nextInt();
        System.out.print("Nhập b: ");
        int b=scan.nextInt();
        System.out.print("Nhập c: ");
        int c=scan.nextInt();
        double delta=b*b-4*a*c;
        if(a==0&& b==0&& c==0){
            System.out.println("Phương trình có vô số nghiệm");
        }else if(a==0&& b!=0){
            System.out.println("Phương trình có 1 nghiệm duy nhất:"+ (double)-c/b);
        }else if(a!=0 && b!=0 && c!=0){
            if(delta==0){
                System.out.println("Phương trình có nghiệm kép: "+(double)-b/(2*a));
            }else if(delta<0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                double x1=(double)(-b+sqrt(delta))/(2*a);
                double x2=(double)(-b-sqrt(delta))/(2*a);
                System.out.println("Phương trình có 2 nghiệm phân biệt x1="+x1+", x2="+x2);
            }
        }
        
    }
}
