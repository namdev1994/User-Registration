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
            return true;
        }
        else
        {
            System.out.println(" invalid First Name ");
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
            return true;
        }
        else
        {
            System.out.println(" invalid Last Name ");
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
            return true;
        }
        else
        {
            System.out.println(" invalid Email Id ");
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
            return true;
        } else {
            System.out.println(" invalid phone Number ");
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
            return true;
        }
        else
        {
            System.out.println(" invalid password");
            return false;
        }
    }
    public static void main(String args[])
    {
        System.out.println("Welcome in User Registraion Program");
        isValidFirstName(sc.nextLine());        //method call for firstName
        isValidLastName(sc.nextLine());        //method call for lastname
        isValidEmailId(sc.nextLine());        //method call for email
        isValidPhoneNumber(sc.nextLine());   //method call for phone number
        isValidPassword(sc.nextLine());     //method call for password
    }
}
