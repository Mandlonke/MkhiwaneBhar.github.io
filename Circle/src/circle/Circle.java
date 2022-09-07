/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;


public class Circle {

    private double radius=1.0;
    private String color= "red";
    public Circle(){
        radius=1.0;
        color="";
    }
    public Circle(double r, String c){
        radius=r;
        color=c;
    }
    public void setradius(double r){
         radius=r;  
    }
     public void setcolor(String c){
         color=c;  
    }
     public double getradius(){
         return radius;
        
     }
      public String getcolor(){
         return color;
        
     }
      public double circle(){
          double area;
          area =(radius*radius)*3.14;
          return area;
      }
      @Override
      public String toString (){
          String bhar=("Radius ="+radius+"\n color="+color+"\n Area="+circle());
          return bhar;
      } 
      }
      
    

