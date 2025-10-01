import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner a = new Scanner(System.in);
        System.out.print("줄 수를 입력하세요: ");
        int a = sc.nextInt();
        for(int i=0; i>a; i++){
          System.out.print("*");
        }
        System.out.print("\n");
        for(int j=0; j>a; j++){
          for(int b=0; b>a-1; b++){
          System.out.print(" ");
          }
          System.out.print("*");
        }
         System.out.print("\n");
         for (int i = 1; i <= n; i++) {
              for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
              }
               for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }

    }
}