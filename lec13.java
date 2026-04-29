// // RECURSIONFUNCTION
// public class lec13 {
//     static void count(int[] arr, int i, int k, int sum, int[] ans, int size, int[] dp) {
//         if(i == arr.length) {
//             if(sum == k) {
//                 for(int j = 0; j < size; j++) {
//                     System.out.print(ans[j] + " ");
//                 }
//                 System.out.println();
//             }
//             return;
//         }
        
        
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 1};
//         int k = 2;
//         int i = 0;
//         int sum=0;
//         int [] ans = new int[arr.length];
//         int size = 0;
//         int[] dp = new int[arr.length];
//         for(int j = 0; j < arr.length; j++) {
//             dp[j] = -1;
//         }
//         count(arr, i, k, sum, ans, size, dp);
//     }
// }

    //  str {a,b,c} & out put {abc},{acb},{bac},{bca},{cab},{cba} 6 permutation
    public class lec13 {
        static void permute(String str, String ans) {
            if(str.length() == 0) {
                System.out.println(ans);
                return;
            }
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                permute(ros, ans + ch);
            }
        }
        public static void main(String[] args) {
            String str = "abc";
            String ans = "";
            permute(str, ans);
        }
    }
        