/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;


public class Purchase {

   private String name;
   private double unitprice;
   
    public Purchase(){
        name="No item";
        unitprice=0.0;
    }
    public Purchase(String name, double unitprice){
    this.name=name;
    this.unitprice=unitprice;  
}
    public String getname(){
    return name;
    }
    public double getunitprice(){
    return unitprice;
    }

    @Override
    public String toString(){
        String G=("NAME="+name+"@"+" "+unitprice);
        return G;
    }
}
