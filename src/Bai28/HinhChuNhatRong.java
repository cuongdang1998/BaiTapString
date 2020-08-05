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
public class HinhChuNhatRong {
    public void ve(int r, int d){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=d;j++){
                if(j==1||i==1||j==d||i==r){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
