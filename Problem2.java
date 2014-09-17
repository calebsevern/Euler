public class Problem2 {

  public static void main(String []args){
     
    int total_sum   = 0;
    int previous    = 1;
    int sum         = 2;
      
    while(sum < 4000000) {
        if(sum % 2 == 0)
            total_sum += sum;
        
        int temp = previous + sum;
        previous = sum;
        sum = temp;
    }
    
   System.out.println(total_sum);
  }
}
