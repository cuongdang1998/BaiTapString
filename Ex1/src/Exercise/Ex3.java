/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author quoccuong
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhập n:");
        int n=scan.nextInt();
        Map<Integer,Integer> m=new HashMap<Integer, Integer>();
        for(int i=1;i<=n;i++){
            m.put(i,i*i);
        }
        System.out.println(m);
        for(Map.Entry<Integer,Integer> map:m.entrySet()){
            System.out.print(map.getKey()+":"+map.getValue()+", ");
        }
    }
}
