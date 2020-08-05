/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n=scan.nextInt();
        
        
        if(!sochinhphuong(n)){
            System.out.println("Số "+n+ " không là số chính phương");
        }else{
            System.out.println("Số "+n+ " là chính phương");
        }
    }  
    public static boolean sochinhphuong(int n){
        double t=sqrt(n)-Math.floor(sqrt(n));
        if(t==0) return true;
        else return false;
    }
}
