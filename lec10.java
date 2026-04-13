//-----------------------------------------------------------------GCD----------------------------------------------------------- 
// public class lec10 {
//     static int gcd(int a ,int b){
//         if (b==0)
//             return a;
//         return gcd(b,a%b);
//     }
//     public static void main(String[] args){
//         int a = 12, b =18 ;
//         System.out.println(gcd(a,b));
//     }
    
// }

//------------------------------------------------------------arraysum-----------------------------------------------------------
// public class lec10 { 
//     static int sumofarry(int[] arr,int i ){
//       if(i==arr.length) 
//         return 0;
//     return arr[i] + sumofarry(arr , i+1);

//     } 
//     public static void main(String[] args){
//        int arr[] = {1,2,3,4};
//        int i = 0;
//        System.out.println(sumofarry(arr, i));
//     }
// }

//------------------------------------------------------------count the digit using recursion-----------------------------------------------------------


// public class lec10{
//     static int countdigit(int n) {
//         if(n==0) 
//             return 0;
//         return 1 + countdigit(n/10);
//     }
//     public static void main(String[] args) {
//         int n = 1234;
//         System.out.println(countdigit(n));
//     }
// }

//---------------------------------------------------------count_elementofarray------------------------------------------------------------------------------------ 
// public class lec10 {
//     static int countoccurofkey(int[] arr, int i, int key) {
//         if(i== arr.length)
//             return 0;
//         int count = (arr[i] == key) ? 1 : 0 ;
//         return count + countoccurofkey(arr, i+1, key );

//     }
//     public static void main(String[] args) {
//          int[] arr = {1,2,3,4,5,6,7} ;
//          int key = 2 ; 
//          int i = 0;
//          System.out.println(countoccurofkey(arr, i, key)); 
         
//     }
// }

//----------------------------------------------------------countnum-----------------------------------------------------------------
// public class lec10 {
//     static int countzero(int n){
//         if (n==0)
//             return 0;
//         int count = (n%10 == 0) ? 1:0;
//         return count + countzero(n/10);
//     }
//     public static void main(String[] args){
//         int n = 1030560;
//         System.out.println(countzero(n));
//     }
// }

//------------------------------------------------------------------maxarry------------------------------------------------------
// find the maximum elemnt of array

// public class lec10 {
//     static int maxnumofarray(int[] arr, int i){
//         if(i == arr.length -1)
//             return arr[i];
//         int smallAns = maxnumofarray(arr ,i+1); 
//         return  Math.max(arr[i],smallAns);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,5,6,9,12,15};

//         System.out.println(maxnumofarray(arr, 0));
//     }
// }

//-----------------------------------------------------------------recursionfunction---------------------------------------------------------

// find the value of x**n 

// public class lec10 {
//     static int power(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         return x*power(x,n-1);
//     }
//     public static void main(String[] args){
//         int x = 2;
//         int n = 3;
//         System.out.println(power(x,n));
//     }
// }

//-------------------------------------------------------------replacenum------------------------------------------------------------
// import java.util.Arrays;

// public class lec10 {
//     static void replace(int[] arr, int i) {
//         if(i==arr.length) return;
//         if(arr[i]==2) 
//             arr[i]= 5;
//         replace(arr, i+1);

//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,6,2};
//         int i = 0;
//         replace (arr, i+1);
//         System.out.println(Arrays.toString(arr));
//     }

// }

//------------------------------------------------------------------ reversenum--------------------------------------------------------
//reverse the number using recursion

// public class lec10 {
//     int rev =0;
//     static int reverse(int n, int rev){
//         if (n == 0) {
//             return rev;
//         }
//         rev = rev * 10 + n%10;
//         return reverse(n/10,rev);
//     }
//     public static void main(String[] args){
//         int n = 123;
//         System.out.println(reverse(n,0));
//     }

// }

//-----------------------------------------------------------------------sum-----------------------------------------------------

// find sum of digit using recursion

// public class lec10 {
//     static int sumofdigit(int n) {
//         if(n==0)
//             return 0;
//         return n%10 + sumofdigit(n/10);
//     }
//     public static void main(String[] args){
//         int n =123;
//         System.out.println(sumofdigit(n));
//     }

// }

//------------------------------------------------------------------sumofeven------------------------------------------------------------

// sum of even number of array

// public class lec10 {
//     static int evensum(int[] arr, int i) {
//         if(i== arr.length)
//             return 0;
//         int val = (arr[i]%2 == 0) ? arr[i] : 0 ;
//         return val + evensum(arr, i+1); 

//     }
//     public static void main(String[] args) {
//          int[] arr = {1,2,3,4,5,6,7} ;
//          int i = 0;
//          System.out.println(evensum(arr, i)); 
         
//     }


// }

//--------------------------------------------------------------------------vowelcount1------------------------------------------------------

//  public class  lec10 {
//     static int vowels(String str, int i) {
//         if(i ==str.length()) 
//             return 0;
//         char ch =str.charAt(i);
//         int count = (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u') ? 1 : 0 ;
//         return count + vowels(str, i+1) ;

//     }
    
//     public static void main(String[] args ) {
//         String str = "hello";
//         int i= 0;
//         System.out.println(vowels(str, i));
//     }
//}
//---------------*----------------*-----------------*-------------------*----------------------*----------------------*-----------------------*-------------------------