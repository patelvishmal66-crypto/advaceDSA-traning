//Q1.  write a program to to find minimum  steps to reduce a number  from n to 1 , you can perform any of the following
// n-1
// n/2
// n/3
//  public class lec14{
   
//         static int minstep(int n){
//             if (n == 1) return 0;

//             int min = minstep(n - 1);
//             if (n % 2 == 0) {
//                 min = Math.min(min, minstep(n / 2));
//             }
//             if (n % 3 == 0) {
//                 min = Math.min(min, minstep(n / 3));
//             }
//             return min + 1;
//         }
//         public static void main(String[] args) {
//             int n = 10;
//             System.out.println(minstep(n));
//         }
//     } 
//  import java.util.Arrays;

//     public class lec14{
//         static int minstep(int n, int[] dp){
//             if (n == 1) return 0;
//             if(dp[n] != -1) return dp[n];

//             int min = minstep(n - 1, dp);
//             if (n % 2 == 0) {
//                 min = Math.min(min, minstep(n / 2, dp));
//             }
//             if (n % 3 == 0) {
//                 min = Math.min(min, minstep(n / 3, dp));
//             }
//             return dp[n] = min + 1;
//         }
//         public static void main(String[] args) {
//             int n = 10;
//             int[] dp = new int[n + 1];
//             Arrays.fill(dp, -1);
//             System.out.println(minstep(n, dp));
//         }
//     }
//  write a program to find the number of steps to reach 1 from n.
// n = 4 
// 1111
// 112
// 121
// 211
// 22

// import java.util.Arrays;

// public class lec14{
//     // static int countstep(int n){
//     //     if (n == 1) return 1;

//     //     int count = countstep(n - 1);
//     //     if (n % 2 == 0) {
//     //         count += countstep(n / 2);
//     //     }
//     //     if (n % 3 == 0) {
//     //         count += countstep(n / 3);
//     //     }
//     //     return count;
//     // }
//     // public static void main(String[] args) {
//     //     int n = 4;
//     //     System.out.println(countstep(n));
//     // }
//     static int countstep(int n, int[] dp){
//         if (n == 1) return 1;
//         if(dp[n] != -1) return dp[n];

//         int count = countstep(n - 1, dp);
//         if (n % 2 == 0) {
//             count += countstep(n / 2, dp);
//         }
//         if (n % 3 == 0) {
//             count += countstep(n / 3, dp);
//         }
//         return dp[n] = count;
//     }
//         public static void main(String[] args) {
//             int n = 4;
//             int[] dp = new int[n + 1];
//             Arrays.fill(dp, -1);
//             System.out.println(countstep(n, dp));
//         }
// }

// write a program to find the maximum sum of a subsequence with no adjacent elements in an array
// arr = {2,1,4,9}
// output = (9+1) = 10
// import java.util.Arrays;

// public class lec14{
//     static int maxsum(int[] arr, int i, int[] dp){
//         if (i >= arr.length) return 0;
//         if(dp[i] != -1) return dp[i];

//         int include = arr[i] + maxsum(arr, i + 2, dp);
//         int exclude = maxsum(arr, i + 1, dp);

//         return dp[i] = Math.max(include, exclude);
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,1,4,9};
//         int[] dp = new int[arr.length];
//         Arrays.fill(dp, -1);
//         System.out.println(maxsum(arr, 0, dp));
//     }
// }
//write a program to find [T/F]
// arr = {1,2,3}
// k = 5



//  str = "1,2"
// 12-> AB
// 12-> L
// 2



