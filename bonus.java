
     
package esercizicarlo;
 
 
import java.util.Scanner;
 
//Creare un programma Bonus che calcola il diritto al bonus degli utenti
//Il programma chiede di inserire due Scanner uno è una stringa e ha due valori possibili "uomo" e "donna".
//L'altro chiede l'età.
//Se il primo valore è uguale a donna e l'età è maggiore di 35 stampa "30% di sconto".
//Se il primo valore è uguale a donna e l'età è minore di 35 stampa "20% di sconto".
//Se il primo valore è uguale a uomo e l'età è maggiore di 35 stampa "15% di sconto".
//Se il primo valore è uguale a uomo e l'età è minore di 35 stampa "10% di sconto".
//altrimenti stampa "dati errati".
 
 
public class bonus {
 
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        String sesso;
        String uomo="uomo";
        String donna="donna";
        int eta=35;
        
        
        System.out.println("inserire sesso: uomo,donna");
        Scanner sc = new Scanner(System.in);
          sesso=sc.nextLine();
                
        
          
          
        System.out.println("inserire eta");
        Scanner num = new Scanner(System.in);
         eta=num.nextInt();
          
       
       if((sesso.equalsIgnoreCase("uomo") && (eta>35))){
           
          System.out.println("sconto 15%");
         
       
       }
      
        if((sesso.equalsIgnoreCase("uomo")&&(eta<35))) {
           System.out.println("sconto 10%");
       }
       
       
      
    if(sesso.equalsIgnoreCase("donna")&& (eta<35)) {
       System.out.println("sconto 30%");
      
    }
     if(sesso.equalsIgnoreCase("donna")&& (eta>35)){
    
    System.out.println("sconto 20%");
    }
     else {System.out.println("dati errari");}
    }
}
 
 
 
    
    
 
 
 
