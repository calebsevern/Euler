public class Problem3 {

  public static void main(String []args) {
    largestPrime(13195);
  }
     
     
  public static int largestPrime(int n) {
    int k = 2;
    int largest = 0;
    while(n > 1) {
      while(n % k == 0) {
        largest = k;
        n /= k;
      }
      
      k = (k > 2) ? k + 2 : 3;
    }
    
    return largest;
  }
}
