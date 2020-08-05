/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai28;

/**
 *
 * @author quoccuong
 */
public class TamGiacDoiXung {
    public void ve(int h){
        for(int i=1;i<=h;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=h-i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=h;i<=2*h;i++){
            for(int j=h;j<=2*h-i;j++){
                System.out.print(" ");
            }
            for(int j=h;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
