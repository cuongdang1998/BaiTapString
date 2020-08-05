/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthuchanh;

import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Bai34 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Mã học sinh:");
        String ma=scan.nextLine();
        System.out.println("Tên học sinh:");
        String ten=scan.nextLine();
        System.out.println("Nhập điểm toán: ");
        float toan=scan.nextFloat();
        System.out.println("Nhập điểm lý: ");
        float ly=scan.nextFloat();
        System.out.println("Nhập điểm hoá: ");
        float hoa=scan.nextFloat();
        float tb=(toan+ly+hoa)/3;
        System.out.println("Điểm trung bình là: "+tb);
        if(toan<0||toan>10||hoa<0||hoa>10||ly<0||ly>10){
            System.out.println("Bạn nhập sai điểm của học sinh");
        }else{
            if(tb<=4){
                System.out.println("Học sinh xếp loại kém");
            }else if(tb>4&&tb<6.5){
                System.out.println("Học sinh xếp loại trung bình");
            }else if(tb>=6.5 &&tb<8){
                System.out.println("Học sinh xếp khá ");
            }else {
                System.out.println("Học sinh xếp loại giỏi");
            }
        }
    }
}
