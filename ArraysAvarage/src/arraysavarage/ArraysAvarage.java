
package arraysavarage;

public class ArraysAvarage {

 public static void main(String[] args) {
            int[][]rates={{3,45,2,6,7,},{7,21,34,17,10},{8,6,4,9,6},{2,5,9,10,10}};
       int sum=0;
       for (int f=0;f<rates.length;f++)
         sum+=rates[f][4];
       System.out.println(sum);
    
       for(int h=0;h<rates[1].length;h++)
            sum+=rates[1][h];
       System.out.println(sum);
    
int fifa[][]=new int[4][5];
System.arraycopy(rates,0,fifa,0,rates.length);
for (int row=0;row<fifa.length;row++){
    for(int col=0;col<fifa[row].length;col++){
        System.out.print(fifa[row][col]+" ");
    }
    System.out.println();
 }
 }
}
// Question 2
public class salesman{
  
}