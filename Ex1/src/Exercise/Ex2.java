/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Ex2 {
    public static int GiaiThua(int n){
        if(n<0){
            return -1;
        }
        else if(n==0){
            return 1;
        }else{
            return n*GiaiThua(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập n:");
        int n=scan.nextInt();
        System.out.println(GiaiThua(n));
        
    }
    
}
