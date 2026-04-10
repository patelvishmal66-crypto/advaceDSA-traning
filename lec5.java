import java.util.Scanner;

// package lect2;

public class lec5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int d= sc.nextInt();
        int arr[][]={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        
        boolean flag =false;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j]==d){
                    flag=true;
                    System.out.println("Found");
                    break;            }
            }
        }              
    
    if(!flag){
        System.out.println("Not found");
    }

  }
}