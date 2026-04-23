// Fibonacci number using recursion

// public class lec11 {
//     static int fib(int n) {
//         if(n<=1)
//             return n;
//         return fib(n-1)+fib(n-2);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fib(n));
//     }
//  }
 //----------------------------------------- Substring-----------------------------------------------------------
//  public class lec11 {
//     static void subset(String p, String up) {
//         //base case
//         if(up.isEmpty()) {
//             System.out.println(p);
//             return ;
//         }
//         char ch = up.charAt(0);

//         //include
//         subset(p + ch , up.substring(1));
//         //exclude
//         subset(p , up.substring(1));
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         subset(" ", str);
//     }
// }
// ---------------------x--------------------x-------------------
// public class array_even {

//     static void even(int[] arr, int i, int sum, String curr) {
//         if (i == arr.length) {
//             if (sum % 2 == 0) {
//                 System.out.println(curr);
//             }
//             return;
//         }
//         even(arr, i + 1, sum + arr[i], curr + arr[i]);
//         even(arr, i + 1, sum, curr);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3 };
//         even(arr, 0, 0, "");
//     }

// }

// ---------------------x--------------------x-------------------

// public class binary {
//     static void totalsum(String str, int n) {
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }
//         totalsum(str + "0", n - 1);
//         totalsum(str + "1", n - 1);

//     }

//     public static void main(String[] args) {
//         int n = 2;
//         totalsum("", n);
//     }

// }

// ---------------------x--------------------x-------------------

// public class pair {
//     static void set(String p, String up, int k) {
//         if (p.length() == k) {
//             System.out.println(p);
//             return;
//         }
//         if (up.isEmpty())
//             return;
//         char ch = up.charAt(0);
//         set(p + ch, up.substring(1), k);
//         set(p, up.substring(1), k);
//     }

//     public static void main(String[] args) {
//         String up = "abcd";
//         String p = "";
//         int k = 2;
//         set(p, up, k);
//     }

// }

// ---------------------x--------------------x-------------------

// public class print_a {
//     static int a(String s, int i, boolean b) {
//         if (i == s.length()) {
//             return b ? 1 : 0;
//         }
//         int x = a(s, i + 1, b || s.charAt(i) == 'a');
//         int y = a(s, i + 1, b);
//         return x + y;
//     }

//     public static void main(String[] args) {
//         String s = "ab";
//         System.out.println(a(s, 0, false));
//     }

// }

// ---------------------x--------------------x-------------------