// public class lec4 {
//     public static void main(String[] args) {
//         String str1 = "hello";
//         String str2 = new String("hi");
//         System.out.println(str1);
//         System.out.println(str2);
//         System.out.println(str1.length());
//         System.out.println(str2.substring(0, 2));
//         System.out.println(str1.replace('l', 'z'));
//            System.out.println(str1.toUpperCase());
//            System.out.println(str1.toLowerCase());
//            System.out.println(str1.charAt(2));
//            System.out.println(str1.equals(str2));
//            System.out.println(str1.contains("world"));
//            String rev = "";
//            for (int i = str1.length() - 1; i >= 0; i--) {
//                rev = rev + str1.charAt(i);
//            }
//            System.out.println(rev);
//            if(str1.equals(rev))
//            {
//                System.out.println("palindrome");
//            }
//            else
//            {
//                System.out.println("not palindrome");
//            }
//     }
// }
import java.util.Arrays;

public class lec4{
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        char[] a  = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b))
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}

