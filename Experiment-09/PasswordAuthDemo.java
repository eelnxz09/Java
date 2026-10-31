import java.util.Scanner;

public class PasswordAuthDemo {
    static void checkPassword(String password) throws Exception {
        if (!password.equals("admin123")) {
            throw new Exception("Authentication Failure!");
        }
        System.out.println("Authentication Successful!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        try {
            checkPassword(pwd);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
