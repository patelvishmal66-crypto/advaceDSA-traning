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
 public class lec11 {
    static void subset(String p, String up) {
        //base case
        if(up.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);

        //include
        subset(p + ch , up.substring(1));
        //exclude
        subset(p , up.substring(1));
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(" ", str);
    }
}