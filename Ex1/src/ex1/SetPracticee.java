/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author quoccuong
 */
public class SetPracticee {
    
    public static void main(String[] args) {
        Set<String> s1=new HashSet<>();
        Set<String> s2=new HashSet<>();
        s1.add("Hello");
        s1.add("Hello");
        s1.add("Mr Cường");
        s1.add("Mr Cường");
        s1.add("Have a nice day !");
        List<String> l=new ArrayList<>();
        l.addAll(s1);
        System.out.println(l);
        //System.out.println("Sử dụng foreach");
        for(String x:s1){
            System.out.print(x+" ");
        }
//        System.out.println("\nSử dụng iterator");
//        Iterator i=s.iterator();
//        while(i.hasNext()){
//            System.out.print(i.next()+" ");
//        }
//        System.out.println("");
    }
}
