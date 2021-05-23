package com.UserRegistration;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
@FunctionalInterface
interface IUserfunction{
    boolean userValidation(String pattern, String input) throws UserRegistrationException;
}

public class UserRegistration {
    public static String firstName, lastName, phoneNumber, password, email;
    public static Scanner sc = new Scanner(System.in);
    /**
     * Here i have taken all the patterns which i have to compare with the userinputs.
     */
    private static final String FIRSTANDLASTNAME = "[A-Z][a-z]{3,}";
    private static final String EMAIL = "^[a-zA-Z0-9]+(?:\\+*-*.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-]?){8,}.*$";
    private static final String PHONENUMBER = "^[0-9]{1,3} [0-9]{10}$";


    public static void main(String args[]) throws UserRegistrationException {

        IUserfunction userRegistration=(checkPattern, givenInput)->{    // Lambda function
            Pattern pattern= Pattern.compile(checkPattern);
            Matcher matcher =pattern.matcher(givenInput);
            if(matcher.matches())                                //matches input With Pattern
            {
                return true;
            }
            else
            {
                throw new UserRegistrationException("Enetr the valid Input");
            }
        };
        System.out.println("Enter Your Firstname: ");
       // firstName=sc.nextLine();
        userRegistration.userValidation(FIRSTANDLASTNAME,sc.nextLine());

        System.out.println("Enter Your Lastname: ");
       // lastName=sc.nextLine();
        userRegistration.userValidation(FIRSTANDLASTNAME,sc.nextLine());

        System.out.println("Enter Your Email-Id: ");
        //email=sc.nextLine();
        userRegistration.userValidation(EMAIL,sc.nextLine());

        System.out.println("Enter Your Phone Number: ");
        //phoneNumber=sc.nextLine();
        userRegistration.userValidation(PHONENUMBER,sc.nextLine());

        System.out.println("Enter Your Password: ");
        //password=sc.nextLine();
        userRegistration.userValidation(PASSWORD,sc.nextLine());

    }


}

