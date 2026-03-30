import java.util.Scanner;

public class Registration {


    Scanner scanner = new Scanner(System.in);
    String userName;
    String Password;
    String phoneNumber;
    String lastName;
    String firstName;
 public boolean checkuserName(String userName) { return userName.length()<=5 && userName.contains("_");}

    public boolean checkPassword(String password){
     if (password.length() < 8 ) return false;

     boolean hasUppercase = false;
     boolean hasSpecial = false;
     boolean hasDigit= false;

     for (char ch : password.toCharArray()) {
         if (Character.isUpperCase(ch)) hasUppercase = true;
         if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
         if (Character.isDigit(ch)) hasDigit = true;
     }
     return hasUppercase && hasSpecial && hasDigit;
    }
public boolean checkphoneNumber(String phoneNumber) {
    return phoneNumber.matches("(\\+27|0)[0-9]{9}");
}
    public void Register () {
     System.out.println("Enter first name.");
     firstName=scanner.nextLine();
     System.out.println("Enter last name");
     lastName= scanner.nextLine();

        do {
            System.out.println("Enter Username");
            userName = scanner.nextLine();
            if (checkuserName(userName)) {
                System.out.println("Username successfully captured");
            } else {
                System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length");

            }
        } while (!checkuserName(userName));

        do {
            System.out.println("Enter Password");
            Password = scanner.nextLine();
            if (checkPassword(Password)) {
                System.out.println("Password successfully captured");
            } else {
                System.out.println("Password is not  correctly formatted; ensure that the password contains at least eight characters a capital letter, a number, a special character.");
            }
        } while (!checkPassword(Password));

        do {
            System.out.println("Enter Phone Number");
            phoneNumber = scanner.nextLine();
            if (checkphoneNumber(phoneNumber)) {
                System.out.println("Cellphone number successfully added.");
            } else {
                System.out.println("Cellphone number incorrectly formatted or does not contain international code.");
            }
        } while (!checkphoneNumber(phoneNumber));
    }}






