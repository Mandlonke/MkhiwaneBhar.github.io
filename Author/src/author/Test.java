/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package author;

import java.util.*;
public class Test {
    static Scanner Bhar=new Scanner (System.in);
  public static void main (String[]args){
      String name;
      String email;
      char gender;
      System.out.print("Plz enter your Name");
      name= Bhar.next();
      System.out.print("Plz enter your Email");
      email= Bhar.next();
      System.out.print("Plz enter your Gender");
      gender= Bhar.next().charAt(0);
     Author bar=new Author(name,email,gender);
     System.out.println(bar);
  }
}
