import java.util.Scanner;

public class a1 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      System.out.print("년도를 입력하세요:");
     int a = sc.nextInt();
if((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
    System.out.println("윤년");
}
else {
  System.out.println("평년");
}
}
}
