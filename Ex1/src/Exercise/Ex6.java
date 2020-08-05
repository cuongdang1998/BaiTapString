/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Ex6 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();  
        if(n>2){
            System.out.print(2+" ");
        }
        for(int i=3;i<=n;i+=2){
            if(laSoNguyenTo(i)){
                System.out.print(i+" ");
            }
        }
    
    }
  
    public static boolean laSoNguyenTo(int n){
        if(n<2){
            return false;
        }
        int check=(int) sqrt(n);
        for(int i=2;i<=check;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
