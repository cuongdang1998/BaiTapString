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
public class Ex5 {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        System.out.println(DeQuy(n));
        System.out.println("");
        for(int i=0;i<=n;i++){
            System.out.print(DeQuy(i)+" ");
        }
        System.out.println("\nKhông sử dụng đệ quy");
        for(int i=0;i<=n;i++){
            System.out.print(KhongDeQuy(i)+" ");
        }
        
        
    }
    public static int KhongDeQuy(int n){
        int f0=0;
        int f1=1;
        int fn=1;
        if(n<0){
            return -1;
        }if(n==0||n==1){
            return n;
        }else{
            for(int i=2;i<=n;i++){
                f0=f1;
                f1=fn;
                fn=f0+f1;
            }
            
        } 
        return fn;
    }
    public static int DeQuy(int n){
        if(n<0){
            return -1;
        }else if(n==1||n==0){
            return n;
        }
        else {
            return DeQuy(n-1)+DeQuy(n-2);
        }
    }
}
