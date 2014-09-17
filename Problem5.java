public class Problem5 {

  public static void main(String []args) {
    int t = smallestMultiple();
  }
     
  public static boolean evenlyDivisible(int n) {
    for(int i=1; i <= 20; i++)
      if(n % i != 0)
        return false;
    return true;
  }
     
  public static int smallestMultiple() {
    int smallest = 1;
    while (!evenlyDivisible(smallest))
      smallest++;
    return smallest;
  }
}
