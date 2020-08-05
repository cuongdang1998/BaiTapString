/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author quoccuong
 */
public class ListPractice {
    
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        String[] a={"This","is","my boss","Cường"};
        l.add("Hello"); l.add("Quốc"); l.add("Cường"); l.add(1,"Đặng");
        System.out.println("Hiển thị các phần tử"); 
        System.out.println(l);
        System.out.println("Duyệt phần tử - sử dụng for");
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");}
        System.out.println("\nDuyệt phần tử sử dụng for cải tiến");
        for(String s: l){
            System.out.print(s+" ");}
        System.out.println("\nDuyệt phần tử sử dụng Iterator");
        Iterator<String> iter1=l.iterator();
        while(iter1.hasNext()){
            System.out.print(iter1.next()+" ");}
        ListIterator<String> iter2=l.listIterator();
        System.out.println("\nDuyện Phần tử sử dụng ListIterator");
        while(iter2.hasNext()){
            System.out.print(iter2.next()+" ");}  
    }
    
}
