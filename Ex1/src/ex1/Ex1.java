/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
       int n;
       System.out.print("Input number: ");
       n=s.nextInt();
       //Staircase(n);
       int a[]=new int[n];
       //NhapMang(a,n);
//       TichTachMang(a,n);
        //MinMaxArray(a,n);
        //BlowCandles(a);
        //HienMang(a);
        //GradingStudent(a,n);
//        System.out.println("Dùng đệ quy");
//        System.out.println(Fibonaci2(n));
//        for(int i=0;i<10;i++){
//            System.out.print(Fibonaci2(i)+" ");
//        }
//        System.out.println("Không sử dụng đệ quy");
//        for(int i=0;i<10;i++){
//            System.out.print(Fibonaci1(i)+" ");
//        }
        //SoNguyenTo(a);
        System.out.println("Sử dụng đệ quy");
        System.out.println(GiaiThua1(n));
        System.out.println("Không sử dụng đệ quy");
        System.out.println(GiaiThua2(n));
    }
    public static int GiaiThua1(int n){
        if(n>0){
            return n*GiaiThua1(n-1);
        }else{
            return 1;
        }
    }
    public static int GiaiThua2(int n){
        int res=1;
        if(n>0){
            for(int i=1;i<=n;i++){
                res*=i;
            }
            return res;
        }else{
            return 1;
        }
    }
    public static void SoNguyenTo(int a[]){
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<a.length;i++){
        
            if(a[i]>=2){
                int count=0;
                for(int j=2;j<=a[i];j++){
                    if(a[i]%j==0){
                        count++;
                    }
                }
                if(count==1){
                   output.add(a[i]);
                }
            }   
        }
        for(int i=0;i<output.size();i++){
            System.out.print(output.get(i)+" ");
        }
    }
    public static int Fibonaci1(int n){
        int f0=0;
        int f1=1;
        int fn=1;
         if(n<0){
            return -1;
        }else if(n==0 || n==1){
            return n;
        }else{
            for(int i=2;i<n;i++){
               f0=f1;
               f1=fn;
               fn=f0+f1;
            }
        }
        return fn;
    }
    public static int Fibonaci2(int n){
        if(n<0){
            return -1;
        }else if(n==0 || n==1){
            return n;
        }else{
            return Fibonaci2(n-1)+Fibonaci2(n-2);
        }
        
    }
    public static void GradingStudent(int ar[],int n){
        int output[]=new int[n];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<38){
                output[i]=ar[i];
            }else if(ar[i]>=38 && ar[i]<=99){
                if(ar[i]%5==3){
                    output[i]+=ar[i]+2;
                }else if(ar[i]%5==4){
                   output[i]+=ar[i]+1; 
                }else {
                    output[i]=ar[i];
                }
            }else if(ar[i]>=100){
                if(ar[i]==100){
                    output[i]=ar[i];
                }else{
                    output[i]=0;
                }
            }
        }
        System.out.println("Sau khi làm tròn");
        for(int i=0;i<n;i++){
            System.out.println(output[i]);
        }
    }
    public static void BlowCandles(int a[]){
        int max=a[0];
        int count=0;
        for(int i=0;i< a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i< a.length;i++){
            if(a[i]==max){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void MinMaxArray(int a[],int n){
        int output[]=new int[n];
        int min,max;
        
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<n;j++){
                temp+=a[j];
            }
            output[i]=temp-a[i];
        }
        HienMang(output);
        max=output[0];
        for(int i=0;i<n;i++){
            if(output[i]>max){
                max=output[i];
            }
            
        }
        min=output[0];
        for(int i=0;i<n;i++){
           
            if(min>output[i]){
                min=output[i];
            }
        }
        
    }
    public static void Staircase(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "); 
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void TichTachMang(int a[],int n){
        int multiply=1;
        for(int i=0;i<n;i++){
            int temp=1;
            for(int j=i;j<n;j++){
                temp*=a[j];
                multiply*=temp;
            }
        }
        System.out.println(multiply);
    }
    public static void NhapMang(int a[],int n){
        System.out.println("Input array output");
       for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
    }
    public static void HienMang(int a[]){
        System.out.println("\nDisplay array output");
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]+" ");
        }
        System.out.println("");
        
    }
    public static void Mang(){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Input the lenghth of arrray: ");
        n=s.nextInt();
        int input[]=new int[n];
        for(int i=0;i<n;i++){
            input[i]=s.nextInt();
        }
        System.out.println("Display array input");
        for(int i=0;i<n;i++){
            System.out.print(" "+input[i]+" ");
        }
        
        int left[]=new int[n];
        int right[]=new int[n];
        int output[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=input[i-1]*left[i-1];
        }
        right[n-1]=1;
        for(int j=n-2;j>=0;j--){
            right[j]=input[j+1]*right[j+1];
        }
        for(int i=0;i<n;i++){
            output[i]=left[i]*right[i];
        }
        System.out.println("\nDisplay array output");
        for(int i=0;i<n;i++){
            System.out.print(" "+output[i]+" ");
        }
    }
    public static String DaoChuoi(String s){
        char output=s.charAt(s.length()-1);
        if(s.length()==1){
            return Character.toString(output);
        }else{
            return output + DaoChuoi(s.substring(0, s.length()-1));
        }
    }
    
}
