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
public class TGCRong {
    public void ve(int h){
        for(int i=1;i<=h;i++){
            for(int j=1;j<=h-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||i==h||j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
