/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package author;

public class Author {
    private String  name;
    private String email;
    private char gender;
    
    public Author() {
        name="";
        email="";
        gender= ' ';
    }public Author(String  name,String email,char gender){
    this.name=name;
    this.email=email;
    this.gender=gender;
    
    }
public void setname(String name){
       
             this.name=name;
             
             
         }
public String Getname(){
    return name;
}
public void setemail(String email){
       
             this.email=email;
             
             
         }
public String Getemail(){
    return email;
}
public void setgender(char gender){
       
             this.gender=gender;
             
             
         }
public char getgender (){
       
            return gender;
}
@Override
public String toString (){
    String Bhar;
    Bhar=(name+"("+gender+")"+" "+"at"+" "+email);
            return Bhar;
            }
}

             
         





        
       
    
    

