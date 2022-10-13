import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int n = sc.nextInt();
                      int[] arr = new int[n];
                      for(int i = 0; i < n; i++){
                          arr[i] = sc.nextInt();
                      }
                    
                    long maxSum = Long.MIN_VALUE;
                    long prefxSum = 0;
                    for(int i = 0; i < n; i++){
                        prefxSum += arr[i];
                        if(prefxSum > maxSum){
                            maxSum = prefxSum;
                        } 
                        if(prefxSum < 0){
                            prefxSum = 0;
                        }
                    }
                    long minSum = Long.MAX_VALUE;
                    long preSum = 0;
                    for(int i = 0; i < n; i++){
                        preSum += arr[i];
                        if(preSum < minSum){
                            minSum = preSum;
                        } 
                        if(preSum > 0){
                            preSum = 0;
                        }
                    }
                    long result = maxSum - minSum;
                    System.out.println(result);
    
    }
}