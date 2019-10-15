 import java.util.*; 
  
public class Main { 
    public static void main(String args[]) 
    { 
  
         ArrayList<String>  list = new ArrayList<String>(); 
  
       
        list.add("I"); 
        list.add("am"); 
        list.add("Inevitable"); 
        list.add("I am"); 
        list.add("Nishchay"); 
  
        
        System.out.println("Unsorted ArrayList: " + list); 
 
        Collections.sort(list); 
  
        
        System.out.println("Sorted ArrayList "  + list); 
    } 
} 