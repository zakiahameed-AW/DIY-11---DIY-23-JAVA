public class PasswordRetries {
    public static void main(String[] args) {
        String correctPassword = "secure123";
        int maxRetries = 3;
        int attempts = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (attempts < maxRetries) {
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();
            attempts++;

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Access granted.");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }

        if (attempts == maxRetries) {
            System.out.println("Maximum attempts reached. Access denied.");
        }

        scanner.close();
    }
    
}
