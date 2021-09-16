
package secuencianumerica;


public class SecuenciaNumerica {

    public static void main(String[] args) {
         
    int anterior=1;
    int actual=2;
    
    System.out.println(anterior + "\n" + actual);
   int temp=0;
   for(;;){
   temp=actual;
   actual=anterior+actual;
   
   anterior=temp;
   System.out.println(actual);
   
   if(actual>1000){break;}
   }
   
          
            
    }
    
}
