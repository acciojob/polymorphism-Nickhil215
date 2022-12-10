package com.driver;

public class Main {
    public static class Product {
        public int product(int x,int y){
            return x*y;
        }
        public  int product(int x, int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
    public static void main(String[]args){

        int y=1,z=1,x=1;
        double a=1.0,b=1.0;
        Product p=new Product();
        p.product(x,y);
        p.product(x,y,z);
        p.product(a,b);
    }

}