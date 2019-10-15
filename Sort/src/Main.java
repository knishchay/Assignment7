import java.util.Arrays;

public class Main {
   public static void main(String args[]) {
      String[] myArray = {"Sneha", "Nishchay", "Vinayak"};
      int size = myArray.length;

      for(int i = 0; i<size-1; i++) {
         for (int j = i+1; j<myArray.length; j++) {
            if(myArray[i].compareTo(myArray[j])>0) {
               String s = myArray[i];
               myArray[i] = myArray[j];
               myArray[j] = s;
            }
         }
      }
      System.out.println(Arrays.toString(myArray));
   }
}