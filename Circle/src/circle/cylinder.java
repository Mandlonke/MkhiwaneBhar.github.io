/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;


public class cylinder extends Circle {
    private double height=1.0;
    public cylinder(){
        super();
         height=1.0;
    }
    public cylinder(double height,double radius, String color){
        super(radius,color);
        this.height=height;
    } 

    cylinder(double d, String blue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setheight(double height){
        height=1.0;
    }
    public double getheight(){
        return height;
    }
    public double calvol(){
        double volume;
        volume=(super.circle()*height);
        return volume;
    }
    @Override
    public String toString(){
        String b=("Radius="+super.getradius()+"Color="+super.getcolor()+"height="+height+"Volume="+calvol());
        return b;
    }
    
  
}
