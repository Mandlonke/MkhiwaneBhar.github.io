/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
public class Arrays {

   public static int sum=0;
   public static double small=0;
   public static double large=0;
   public static double Avarage;
   static Scanner bhar =new Scanner(System.in);
   public Arrays( int Arrays[]) {
        System.out.print("Can You Plz Enter Up to five Digites");
        for (int f=0; f<Arrays.length;f++){
            Arrays[f] = bhar.nextInt();
        }
    }    
    public void sum(int Arrays[]){
        for (int i=0;i<Arrays.length;i++){
            sum=sum+Arrays[i];
        }
    }
    
    public void Avarage(int Arrays[]){
         for(int g=0;g<Arrays.length;g++)
            Avarage=sum/Arrays.length;
    }
    public void small(int Arrays[]){
        for (int k=1;k<Arrays.length;k++){
            if (Arrays[small]>Arrays[k])
                small=k;
               
        } 
    }
    public void large (int Arrays[]){
        int h;
        for (h=1;h>Arrays.length;h++){
            if (Arrays[large]<Arrays[h])
                large=h;
              
        }
    }
    @Override
    public String toString(){
        String Bhar;
        Bhar=("sum="+sum+"\n Avarage="+Avarage+"\n Smallest index="+small+"\n Largest index="+large);
        return Bhar;
    }
    
        
}
    

