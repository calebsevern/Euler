public class Problem7 {

  public static void main(String []args){
   int t = getNthPrime(10001);
  }
     
  public static boolean isPrime(int n) {
    if (n % 2 == 0) 
      return false;
    for(int i=3; i * i <= n; i += 2) {
      if(n % i == 0)
        return false;
    }
  
    return true;
  }
     
  public static int getNthPrime(int n) {
   int index = 1;
   int primes_found = 0;
   int current_prime = 0;
         
   while(primes_found < n) {
     if(isPrime(index)) {
        primes_found++;
        current_prime = index;
     }
           
     index++;
   }
         
   return current_prime;
  }
}
