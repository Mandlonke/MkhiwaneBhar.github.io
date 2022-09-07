/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exersise1.arrays;

/**
 *
 * @author Bhar
 */
public class Exersise1Arrays {

    
    public static void main(String[] args) {
        int sum=0;
        double Avarage;
        int[]product= {14,5,37,8,57};
        int i;
        for(i=0;i<product.length;i++){
            sum+=product[i];
            
        }
        Avarage =sum/product.length;
       System.out.println("Sum ="+sum);
       System.out.println("Avarage="+ Avarage);
       
    }
    
}
