

// public class lec9 {
//     public static void main(String[] args) {
//         String str1 = "abc";
//         int count = 0;
//         for (int i=0; i<str1.length(); i++) {
//             for (int j=i; j<str1.length(); j++) {
//                 if(str1.charAt(i) == str1.charAt(j)) {
//                     count++;

//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }





// public class lec9 {
//     public static void main(String[] args) {
//         String str1 = "abc";
//         char remove ='a';
//         String result = " ";
//         for (int i=0; i<str1.length(); i++){
//             if(str1.charAt(i) != remove) {
//                 result += str1.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }



//  public class lec9 {
//     public static void main(String[] args) {
//         String str1 = "a3b4c9d1e6" ;
//         char max =0;
//         for(int i=0; i<str1.length(); i++) {
//             char ch = str1.charAt(i);
//             if(ch >= '0' && ch <= '9' && ch > max ) {
//                 max = ch;
//             }
//         }
//         System.out.println(max);
//     } 
// }




// public class lec9 {
//     public static void main(String[] args) {
//         String str1 = "12";
//         String str2 = "34";
//         int num1 = 0;
//         int num2 = 0; 

        
//         for (int i=0; i<str1.length();i++) {
//             num1 = num1+10+(str1.charAt(i) - '0');
//         }
//             for (int i=0; i<=str2.length(); i++) {
//                 num2 = num2+10+(str2.charAt(i) - '0');
                
//             }
//             System.out.println(num1 + num2);
            
//         }
//     }


public class lec9 {
    public static void main(String[] args) {
        String str1 = "12345abc";
        boolean isNum = true;
        for (int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) < '0' || str1.charAt(i) > '9') {
                isNum = false;
                break;
            }
        }
        System.out.println(isNum);
    }
}