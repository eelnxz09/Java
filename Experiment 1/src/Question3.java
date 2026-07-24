import java.util.Scanner;

public class Question3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=10 , b=20;

        if (a % 2 == 0)
            System.out.println(a + " is Even");
        else
            System.out.println(a + " is Odd");

        if (b % 2 == 0)
            System.out.println(b + " is Even");
        else
            System.out.println(b + " is Odd");

        sc.close();
    }
}
