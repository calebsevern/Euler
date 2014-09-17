public class Problem4 {

  public static void main(String []args) {
    int n = largestPalindrome();
  }
     
  public static boolean isPalindrome(String s) {
    String first_half = s.substring(0, (s.length() / 2));
    String second_half = new StringBuilder(s.substring((s.length() / 2), s.length())).reverse().toString();
  
    if(first_half.equals(second_half))
      return true;
    else
      return false;
  }
     
  public static int largestPalindrome() {
        
    int largest = 0;
         
    for(int i=0; i<1000; i++) {
      for(int j=0; j<1000; j++) {
      
        if((isPalindrome(Integer.toString(i * j))) & (i * j > largest))
          largest = i * j;
      }           
    }
    
    return largest;
  }
}
