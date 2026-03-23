import java.util.Scanner;

public class Registration {
        public String Username;
        public String Password;
        public int PhoneNumber;

        public void Register() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter username");
            Username= scanner.nextLine();
            System.out.println("Please enter password");
            Password = scanner.nextLine();
            System.out.println("Please enter phone number");
            Username =  scanner.nextLine();

        }



    }

