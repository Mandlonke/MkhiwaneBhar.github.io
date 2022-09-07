/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salesman;

/**
 *
 * @author Bhar
 */
public class Functions {
    public static void main(String[]args){
        double[]price={14,5,37,8,57};
        double result;
        result=avarage(price);
        display(result);   
    }
    public double avarage(double[] price){
    double Avg;
    double sum=0;
    for (int h=0;h<price.length;h++)
        sum=sum+price.length;
    Avg=sum/price.length;
    return Avg;
    }
    public void display(double Avg){
        System.out.println(Avg);
    }
    
}
