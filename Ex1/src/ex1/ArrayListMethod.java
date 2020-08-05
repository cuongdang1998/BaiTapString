/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author quoccuong
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Cường"); list.add("Đặng"); 
        list.add("Quốc"); list.add("Cường");

        Object[] a=list.toArray();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
//        System.out.println("Kiểm tra xem list có tồn tại phần tử hay không ?");
//        System.out.println(list.contains("Cường"));
//        System.out.println(list.contains("Ralph"));
//        System.out.println("Trả về vị trí đầu tiên xuất hiện phần tử");
//        System.out.println(list.indexOf("Cường"));
//        System.out.println(list.indexOf("CƯỜNG"));
//        System.out.println("Trả về vị trí xuất hiện cuối cùng của phần từ");
//        System.out.println(list.lastIndexOf("Cường"));
//        System.out.println(list.lastIndexOf("CƯỜNG"));
//        System.out.println("== Truy cập đến phần tử chỉ số 1:"+list.get(1));
//        System.out.println("== Mảng sau cập nhật giá trị phần tử chỉ số 3 thành Ralph ==");
//        list.set(3, "Ralph");
//        show(list);
//        System.out.println("== Mảng sau khi xoá phần tử theo chỉ số index ==");
//        list.remove(3);
//        show(list);
//        System.out.println("== Mảng sau khi xoá phần trực tiếp phần tử đó ==");
//        list.remove("Cường");
//        show(list);
//        System.out.println("== Xoá tất cả các phần tử trong ArrayList ==");
//        list.clear();
//        System.out.println("== Kích thước mảng danh sách sau khi xoá: "+list.size());
    }
    public static void TimKiem(ArrayList<String> a){
        System.out.println(a.contains("Cường"));
        System.out.println(a.contains("Ralph"));
    }
    public static void show(ArrayList<String> a){
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println("");
    }
}
