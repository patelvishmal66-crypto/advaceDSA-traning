// public class lec7 {
//     public static void main(String[] args) {
//         String str1 = "hello";
//         String str2 = new String("hi");
//         System.out.println(str1);
//         System.out.println(str2);
//         System.out.println(str1.length());
//         System.out.println(str1.substring(0, 2));
//         System.out.println(str1.replace('l', 'z'));
//         System.out.println(str1.toUpperCase());
//         System.out.println(str1.toLowerCase());
//         System.out.println(str1.charAt(2));
//         System.out.println(str1.equals(str2));
//         System.out.println(str1.contains("World"));
//         String rev = "";
//         for (int i = str1.length() - 1; i >= 0; i--) {
//             rev = rev + str1.charAt(i);
//         }
//         System.out.println(rev);
//         if (str1.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

//import java.util.Arrays;

// public class lec7 {
//     public static void main(String[] args) {
//         String str1 = "sillent";
//         String str2 = "listen";

//         char[] a = str1.toCharArray();
//         char[] b = str2.toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         if (Arrays.equals(a, b))

//         {
//             System.out.println("Anagram");
//         } else {
//             System.out.println(" Not Anagram");
//         }

//     }
// }

// public class lec7 {
//     public static void main(String[] args) {
//         String str1 = "aabbccde";
//         String result = "";
//         int count = 1;
//         for(int i=0;i<=str1.length()-1;i++)
//         {
//           if(str1.charAt(i)  == str1.charAt(i+1)) {

//           }
//         }

//     }
// }

// public class lec7 {
//     public static void main(String[] args) {
//         String str1 = "aabbccde";
//         String result = " ";
//         int count = 1;
//         for (int i = 0; i <= str1.length() - 1; i++) {
//             if (str1.charAt(i) == str1.charAt(i + 1)) {
//                 count = 1;
//             }

//         }   
//         result += str1.charAt(str1.length() - 1) + " " + count;
//         System.out.println(result);
//     }
//}

public class lec7 {
    public static void main(String[] args) {
        String str = "abc";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));// continuous part of a string
            }
        }

        // a
        // ab
        // abc
        // b
        // bc
        // c
    }
}