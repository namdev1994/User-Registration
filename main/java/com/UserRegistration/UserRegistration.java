package com.UserRegistration;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserRegistration {
    static Scanner sc=new Scanner(System.in);
    public static boolean isValidFirstName(String firstName)
    {
        String firstNamePattern="^([A-Z]{1})+[a-zA-Z]{2,}$"; //set Pattern
        Pattern pattern= Pattern.compile(firstNamePattern);
        Matcher matcher =pattern.matcher(firstName);
        if(matcher.matches())                                //matches input With Pattern
        {
            System.out.println("Valid firstname");
            return true;
        }
        else
        {
            System.out.println("Enter valid FirstName");
            return false;

        }
    }
    public static boolean isValidLastName(String lastName)
    {
        String lastNamePattern="^([A-Z]{1})+[a-zA-Z]{2,}$";    //Set Pattern
        Pattern pattern= Pattern.compile(lastNamePattern);
        Matcher matcher =pattern.matcher(lastName);
        if(matcher.matches())                                 //pattern Matches check
        {
            System.out.println("Vlaid lastname");
            return true;
        }
        else
        {
            System.out.println("Enter valid LastName");
            return false;
        }
    }
    public static boolean isValidEmailId(String email)
    {
        String emailPattern="^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";//set pattern for email id
        Pattern pattern= Pattern.compile(emailPattern);
        Matcher matcher =pattern.matcher(email);
        if(matcher.matches())                        //check Input and Pattern
        {
            System.out.println("valid Email");
            return true;
        }
        else
        {
            System.out.println("Enter Valid Email");
            return false;
        }
    }
    public static boolean isValidPhoneNumber(String phoneNumber)
    {
        String phoneNumberPattern = "^[0-9]{2}[ ]+[0-9]{10}";    //set pattern
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches())                                 //Check input and Pattern
        {
            System.out.println("valid Phone number");
            return true;
        } else {
            System.out.println("Enter valid phone Number");
            return false;
        }
    }
    public static boolean isValidPassword(String password)
    {
        String passwordPattern= "^(?=.*[0-9])(?=.*[@#$%^&!])(?=.*[A-Z])(?=.*[a-z]).{8,}$";    //set Pattern
        Pattern pattern= Pattern.compile(passwordPattern);
        Matcher matcher =pattern.matcher(password);
        if(matcher.matches())                           //Check Input And Pattern
        {
            System.out.println("valid password");
            return true;
        }
        else
        {
            System.out.println("Enetr valid password");
            return false;
        }
    }
    public static void main(String args[])  {
        System.out.println("Welcome in User Registraion Program");
        System.out.println("Enter firstName");
        String firstName= sc.next();
        isValidFirstName(firstName);        //method call for firstName
        System.out.println("Enter laststName");
        String lastName=sc.next();
        isValidLastName(lastName);        //method call for lastname
        System.out.println("Enter Email");
        String email=sc.next();
        isValidEmailId(email);        //method call for email
        System.out.println("Enter Phone Number");
        String phoneNumber=sc.next();
        isValidPhoneNumber(phoneNumber);   //method call for phone number
        System.out.println("Enter password");
        String password=sc.next();
        isValidPassword(password);     //method call for password
    }
}
