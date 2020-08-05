/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author quoccuong
 */
public class PractiseMap {
    
    public static void main(String[] args) {
        //Kiểu generic
        HashMap<Integer,String> m1=new HashMap<Integer,String>();
        m1.put(1, "Hello");
        m1.put(2, "Anh");
        m1.put(3, "Cường");
        m1.put(4, "Cute");
        System.out.println(m1);
//        for(Map.Entry<Integer,String> entry: m1.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        for(Integer i: m1.keySet()){
//            System.out.println(i+" "+ m1.get(i)+" ");
//        }
        //Kiểu non-generic
        Map m2=new HashMap();
        m2.put("Cường", "Tên");
        m2.put("Quốc", "Đệm");
        m2.put("Đặng", "Họ");
        Set set=m2.keySet();
//        for(Object key:set){
//            System.out.println(key+" "+m2.get(key));
//        }
        //Sử dụng map.entry interface
                
    }
}
