/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;


public class TestArrays {
    public static void main(String[]Args){
        int[]cc=new int[6];
        
        Arrays c=new Arrays(cc);
        c.sum(cc);
        c.Avarage(cc);
        c.small(cc);
        c.large(cc);
        System.out.print(cc);
    }
    
}
