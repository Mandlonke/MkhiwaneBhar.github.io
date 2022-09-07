
package basiccalculation;


public class BasicCalculation {
    private int var1;
    private int var2;
    public BasicCalculation(){
        var1=0;
        var2=0;
    }
    public BasicCalculation(int var1,int var2){
        this.var1=var1;
        this.var2=var2;
    }

 public void setvar1(int var1){
     this.var1=var1;
 }
 public void setvar2(int var2){
     this.var2=var2;
 }
 public int getvar1(){
     return var1;
 }
 public int getvar2(){
     return var2;
}
 public int add(){
     int add;
     add=var1+var2;
     return add;
 }
 public int sub(){
     int sub;
     sub=var1-var2;
     return sub;
 }
 public int div(){
     int div;
     div=var1/var2;
     return div;
 }
 @Override
 public String toString(){
     String Leo;
     Leo=("var1="+var1+"\n var2="+var2+"\n add="+add()+"\n sub="+sub()+"\n div="+div());
     return Leo;
 }
 }
