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
public class SortCollection2 {
    public static void main(String[] args) {
        List<Double> list1=new ArrayList<Double>();
        list1.add(12.5);    list1.add(11.1);    list1.add(9.7);
        list1.add(18.7);    list1.add(-10.3);
        System.out.println("Sort tăng dần");
        Collections.sort(list1);
        for(Double d:list1){
            System.out.print(d+" ");
        }
        System.out.println("\nSort giảm dần");
        Collections.sort(list1, new Comparator<Double>(){
            @Override
            public int compare(Double o1, Double o2) {
                return o2>o1? 1:-1;
            }
        });
        for(Double d:list1){
            System.out.print(d+" ");
        } 
        System.out.println("");
    }

   
    
}
