package com.harman.project4;

public class Poly {
    public int addNumbers(int a,int b){
        return a+b;
    }
    public int addNumbers(int a,int b,int c){
        return  a+b+c;
    }

    public static void main(String[] args) {
        Poly p=new Poly();

        int result1=p.addNumbers(21,34);
        int result2=p.addNumbers(34,55,76);
        System.out.println(result1);
        System.out.println(result2);
    }
}
