/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

public class weughedItems extends Purchase {
    private double kg;
   

public weughedItems(){
    super();
    kg=0.0;
   
}
public weughedItems(String name, double unitprice, double kg){
    super(name,unitprice);
    this.kg=kg;
    
}
public void setkg(double kg){
this.kg=kg;
}

public double getkg(double kg){
    return kg;
}
 @Override
    public double getunitprice(){
        return super.getunitprice();
    }

@Override
public String toString(){
  String A;
        A = super.toString()+"  "+kg+"Kg";
return A;  
}
}

