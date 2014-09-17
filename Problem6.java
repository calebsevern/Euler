public class Problem6 {

  public static void main(String []args) {
    int a = sumSquareDiff(100);
  }
     
  public static int sumSquareDiff(int n) {
    int sum1 = 0;
    int sum2 = 0;
    
    for(int i=1; i <= n; i++)
      sum1 += i * i;
        
    for(int i=1; i <= n; i++)
      sum2 += i;
          
    sum2 *= sum2;
    return (sum2 - sum1);
  }
}
