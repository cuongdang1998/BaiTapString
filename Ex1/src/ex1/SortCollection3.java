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
public class SortCollection3 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("1","Cường","CEO"));
        list.add(new Employee("2","Đặng","Co-Founder"));
        list.add(new Employee("3","Anh","CEO's Wifi"));
        list.add(new Employee("4","Lâm","Security"));
        System.out.println("Cách 1:Sort tăng dần");
        Collections.sort(list);
        for(Employee e: list){
            System.out.println(e.toString());
        }
        System.out.println("Cách 2: Sort tăng dần");
        Collections.sort(list, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }  
        });
        for(Employee e: list){
            System.out.println(e.toString());
        }
    }
}
