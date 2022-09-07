/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

/**
 *
 * @author Bhar
 */
public class countedItems extends Purchase {
    private int quantity;
    public countedItems(){
        super();
        quantity = 0;
    }
    public countedItems(String name, double unitprice, int quantity){
        super(name, unitprice);
        this.quantity = quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    @Override
    public double getunitprice(){
        return super.getunitprice();
    }
    @Override
    public String toString(){
        String str = super.toString()+"  "+quantity+"  Units";
        return str;
    }
}
