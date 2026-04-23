// import java.util.Scanner;

// public class day2{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Input
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // Output
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }




import java.util.Scanner;

//count span of the number

public class lec2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
                sc.close();

        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");   
        }
        // int max = arr[0];
        // int min = arr[0];
        // for(int i=1; i<n; i++) {
        //     max = Math.max(max, arr[i]);
        //     min = Math.min(min, arr[i]);

        // } 
        System.out.println();
        // System.out.println(max - min);

        int d = sc.nextInt();
        int index = -1;
        for (int i= 0; i<n; i++){
            if (arr[i] == d) {
               index = i;
               break;
            }
        }
        System.out.println(index);
    }
}                             




 