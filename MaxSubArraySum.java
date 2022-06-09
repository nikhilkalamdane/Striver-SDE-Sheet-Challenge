import java.util.*;
public class MaxSubArraySum {
    static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
              
            }

            System.out.println(maxSubArray(arr));
            T--;
        }
        sc.close();
    }
}
