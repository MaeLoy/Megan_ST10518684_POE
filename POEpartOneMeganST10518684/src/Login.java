public class Login {

    private  String userName;
    private String Password;
    private String firstName;
    private String lastName;

    public Login(String userName, String password, String firstName, String lastName) {
        this.userName= userName;
        this.Password= password;
        this.firstName= firstName;
        this.lastName= lastName;


    }

    public String loginUser (String enteredUsername, String enteredPassword){
        if(enteredUsername.equals(this.userName)&&enteredPassword.equals(this.Password)){
            return "Welcome" + firstName + " " + lastName + " " + "It is great to see you.";
        }else{
            return "Username or Password incorrect.Please try again." ;
        }
    }
}
