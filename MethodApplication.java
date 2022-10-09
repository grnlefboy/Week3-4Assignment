

public class MethodApplication {
  
  public static String wordRepeat(String word, int n) {
    String newString = "";
    for (int i = 0; i < n; i++) {
        newString += word;
    }
    
    return newString;
  }

  public static String fullName(String firstName, String lastName) {
    
    String fullName = firstName.concat(" ").concat(lastName);
    return fullName;
    
  }
  
  public static Boolean arrayChecker(int [] arr1) {
    
    
    int total = 0;
    for(int j = 0; j<arr1.length; j++) {
      total += arr1[j];
    }
    if(total>100) {
      return true;
    }
    else {
      return false;}
     
  }
  
  public static Boolean arrayAverage(double[] arr1, double[] arr2) {
    
    double total = 0; 
    for(int k = 0; k<arr1.length; k++) {
      total += arr1[k];}
    
          double arr1Avg = total/arr1.length;
    
    double total2 = 0;
    for(int l =0; l<arr2.length; l++){
      total2 += arr2[l]; }
    
          double arr2Avg = total2/arr2.length;
      
      if(arr1Avg > arr2Avg) {
        return true;
    }
      else {
        return false;
    }
      
  }
  
  public static Boolean willBuyDrink(boolean x, double y) {
    
 if((y>10.50) && (x = true)) {   
   return true;}
 else {
   return false;
 }
  }
  
  
  //
  public static Boolean lostWeight(double[]week ) {
    if(week[0]> week[week.length-1] ){
      return true;
    }
    else {
      return false;
    }
  }
  
    
  
  
  public static void main(String[] args) {
    
    
    

    int[] intArray = new int[] { 40, 60, 1 };
    double[] intArray1 = new double[] {152.1, 9.9, 3.2 };
    double[] intArray2 = new double[] {17.5, 53.67, 60.24, 4.4, 5 };
    double[] week1 = new double[] {166.2, 165.7, 166.0, 164.0, 162.6, 163.3, 161.0};
    
    
    
    System.out.println(wordRepeat("Hello", 3));
    System.out.println("Full name is:"+ fullName("Bronson","Greenleaf"));
    System.out.println("Avg > 100 is: " + arrayChecker(intArray));
    System.out.println("Avg1 > Avg2 is: " + arrayAverage(intArray1, intArray2));
    System.out.println(willBuyDrink(true, intArray1[0]));
    System.out.println("The diet is working is:" +   lostWeight(week1));
  }

}
