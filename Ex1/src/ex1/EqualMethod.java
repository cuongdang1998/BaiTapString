/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quoccuong
 */
public class EqualMethod {
    public static void main(String[] args) {
        Employee e1=new Employee("1","Cường","CEO");
        Employee e2=new Employee("2","Quốc","Co-Founder");
        Employee e3=new Employee("3","Dang","Kế toán");
        
        List<Employee> list=new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        Employee eSearch1=new Employee("1");
        Employee eSearch2=new Employee("4");
        System.out.println("list.contains(eSearch1): "+ list.contains(eSearch1));
        System.out.println("list.contains(eSearch2): "+ list.contains(eSearch2));
    }
}
