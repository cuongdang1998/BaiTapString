/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author quoccuong
 */
public class PracticeSortingCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("Anh");
        list.add("Quốc");
        list.add("Cường");
        List<Double> list2=new ArrayList<Double>();
        list2.add(12.5);
        list2.add(11.1);
        list2.add(9.7);
        list2.add(18.7);
        list2.add(-10.3);
        
        System.out.println("Sort tăng dần");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Sort giảm dần");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o2.compareTo(o1);
            }
        });
        System.out.println(list);
    }
}
