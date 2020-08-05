/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import static baitapthuchanh.Bai22.BSCNN;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai25 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int nam=scan.nextInt();
        if(nam%400 ==0 || (nam%4==0 && nam%100!=0)){
            System.out.println("Năm "+nam+" là năm nhuận");
        }else{
            System.out.println("Năm "+nam+" không là năm nhuận");
        }
    }
}
