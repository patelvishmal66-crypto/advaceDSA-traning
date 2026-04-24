//                                                                          Palindrome String
// import java.util.*;

// public class lec12 {

//     static int[][] dp = new int[100][100];

//     static boolean ways(String str, int start, int end) {

//         if (start >= end) return true;

//         if (dp[start][end] != 0) {
//             return dp[start][end] == 1;
//         }

//         if (str.charAt(start) != str.charAt(end)) {
//             dp[start][end] = -1;
//             return false;
//         }

//         boolean ans = ways(str, start + 1, end - 1);

//         if (ans) {
//             dp[start][end] = 1;
//         } else {
//             dp[start][end] = -1;
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         String str = "madamhk";
//         System.out.println(ways(str, 0, 6));
//     }
// }



//                                                                          Subsequence


// // Write a program to count Sub
// public class lec12 {
//     static int ways(String str, int i , int [] dp){
//         if (i == str.length()) return 1;
//         if(dp[i] != -1) return dp[i];
//         int x = ways(str, i+1,dp);
//         int y = ways(str,i+1, dp);
//         return dp[] ;
//     }

    
//     public static void main(String[] args) {
//         int n = 6;
//         System.out.println();

//     }
    
// }


//                                                                          Sum digit 

// import java.util.*;

// public class lec12{
//     static int count(int n , int[] dp)
//     {
//         if(n==0){
//             return 0;
//         }
//         if(dp[n] != -1)
//             return dp[n];
//         dp[n] = n%10 + count(n/10, dp);
//         return dp[n];
//     }
//     public static void main(String[] args){
//         int n = 12345;
//         int[] dp = new int[n+10];
//         Arrays.fill(dp, -1);
//         System.out.println(count(n , dp));
//     }
    
// }


//                                                                          Vowel Counter 
// import java.util.*;

// public class lec12 {
//     static int ways(String str, int i, int[] dp) {
//         if(i == str.length()) return 0;
//         if(dp[i] != -1) return dp[i];
//         char ch = str.charAt(i);
//         if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
//             dp[i] = 1 + ways(str, i+1 ,dp);
//         }else{
//             dp[i] = ways(str, i+1, dp);
//         }
//         return dp[i];
//     }
//     public static void main(String [] args) {
//         String str = "education";
//         int[] dp = new int[str.length() + 1];
//         Arrays.fill(dp, -1);
//         int i = 0;
//         System.out.println(ways(str, i, dp));
//     }

    
// }

//                                                                          Ways 

// import java.util.*;

// public class lec12 {
//     static int ways(int n, int[] dp){
//         if(n == 0 | n == 1){
//             return  1;
//         }
//         if(dp[n]!=-1) {
//             return dp[n];
//         }
//         dp[n] = ways(n-1, dp) + ways(n-2, dp);
//         return dp[n];
//     }
//     public static void main(String[] args) {
//         int n = 6;
//         int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(ways(n, dp));
//     }
    
// }


//                                                                          counterzeroes
// import java.util.*;

// public class lec12{
//     static int ways(int n, int[] dp) {
//         if(n == 0 ) return 0 ;
//         if(dp[n] != -1) return dp[n];
//         if(n%10 == 0)
//         {
//             dp[n] = 1+ ways(n/10, dp);
//         }else{
//             dp[n] = ways(n/10, dp);
//         }return dp[n];

//     }
//     public static void main(String[] args) {
//         int n = 10207000;
//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         System.out.println(ways(n, dp));
//     }
// }


//                                                                          Fibonacci

// Write a optimise code for fibonacci series

import java.util.*;

public class lec12 {
    static int fibo(int n, int[] dp){
        if(n<=1){
            return n;
        }
        // return fibo(n-1) + fibo(n-2);
        if(dp[n]!=-1) {
            return dp[n];
        }
        dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(n, dp));
    }
}