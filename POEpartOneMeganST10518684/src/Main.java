
    public static void main() {
        Registration registration = new Registration();
        registration.Register();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please log in now.");
        System.out.println("Enter Username: ");
        String loginUser = scanner.nextLine();
        System.out.println("Enter Password: ");
        String loginPass = scanner.nextLine();

        Login login = new Login(registration.userName, registration.Password, registration.firstName, registration.lastName);
        System.out.println(login.loginUser(loginUser, loginPass));
    }

