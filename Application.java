
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
  

  public static void main(String[] args) {
    
    
    Integer[] ages = new Integer[]{ 3, 9, 23, 64, 2, 8, 28, 93};
    
    List<Integer> agesList = new ArrayList<Integer>(Arrays.asList(ages));
    
    
    
    System.out.println("The first subtraction is: "+ (ages[ages.length-1] - ages[0]) );
    
    agesList.add(5);
    
    ages = agesList.toArray(ages);
    
    System.out.println("The second subtraction from the new array is:" + (ages[ages.length-1] - ages[0]) );
    
    int sum = 0;
    
    for(int i= 0; i<ages.length;i++) {
    sum += ages[i];  
    }
    System.out.println("The new ages array average is:" + (sum/ages.length));
    
    }
  
  

 

}
