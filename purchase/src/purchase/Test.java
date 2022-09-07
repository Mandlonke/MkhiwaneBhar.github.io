/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;


public class Test {
    public static void main(String[]args){
        Purchase M=new Purchase("Banana",1.37);
        weughedItems M1 = new weughedItems("Banana",3.0,1.37);
        countedItems M2 = new countedItems("Pens",4.5,10);
        
        System.out.println(M);
        System.out.println(M1);
        System.out.println(M2);
    }
    
}
