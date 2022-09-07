
package library;


public class Library {
private String tittle;
private String publisher;
private int Cnumber;
public Library(){
   tittle="";
    publisher="";
      Cnumber=0;
}
    public Library(String tittle,String publisher, int Cnumber ){  
        this.tittle=tittle;
        this.publisher=publisher;
        this.Cnumber=Cnumber;
    }
    public void settittle (String tittle){
        this.tittle=tittle;
    }
      public void setpublisher (String publisher){
        this.publisher=publisher;
    }
        public void setCnumber (int Cnumber){
        this.Cnumber=Cnumber;
    }
        public String gettittle(){
            return tittle;
        }
         public String getpublisher(){
            return publisher;
        }
          public int getCnumber(){
            return Cnumber;
        }
          @Override
          public String toString(){
              String A=("Tittle="+tittle+"\n Publisher="+publisher+"\n Account Number="+Cnumber);
              return A;
          }
}
   
    
    

