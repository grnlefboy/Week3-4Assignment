import java.util.Arrays;
import java.util.List;

public class StringApplication {

  public static void main(String[] args) {
    
    String[] names={"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
    
    double total = 0;
 
    for(String name : names) {
     total += name.length();
    }
    
    System.out.println("The average letters of a word is:"+(total/names.length) );
    
   List<String> namesList= Arrays.asList(names);
   
   StringBuilder str = new StringBuilder();
   
   for(String element :namesList) {
     str.append(element).append(" ");
     
   }
   
   
   
   System.out.println("Concatenated array with spaces is:" + str);
   
   
   int[] nameLength = new int[names.length];
   
   for(int i = 0;i<names.length;i++) {
      
     nameLength[i] = names[i].length();
   }
   
  System.out.println("The lengths are"+ java.util.Arrays.toString(nameLength));
  
  int total1 = 0;
  
  for(int value: nameLength) {
   total1 += value;
  }
   System.out.println("Sum of the lengths in the array is "+ total1);
   
   
   
    
  }
  
}
