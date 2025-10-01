import java.util.Scanner;
public class a2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.print("줄 수를 입력하세요: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
        System.out.println();
         for (int i = 1; i <= a; i++) {
            // 공백 먼저 출력
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
         System.out.print("\n");
         for (int i = 1; i <= a; i++) {
              for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
              }
               for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        System.out.println();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }
        for (int i = a-1; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }

    }
}
