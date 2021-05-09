package com.UserRegistration;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UserRegistration {
    static Scanner sc=new Scanner(System.in);
    public static void isValidFirstName()
    {
        System.out.println("Enetr First Name : ");
        String firstName=sc.nextLine();                       //Accept Input
        String firstNamePattern="^([A-Z]{1})+[a-zA-Z]{2,}$"; //set Pattern
        Pattern pattern= Pattern.compile(firstNamePattern);
        Matcher matcher =pattern.matcher(firstName);
        if(matcher.matches())                                //matches input With Pattern
        {
            System.out.println("Enter Last Name :");
        }
        else
        {
            System.out.println(" invalid First Name ");
        }
    }
    public static void isValidLastName()
    {
        String lastName=sc.nextLine();                          //Accept LastNem From User
        String lastNamePattern="^([A-Z]{1})+[a-zA-Z]{2,}$";    //Set Pattern
        Pattern pattern= Pattern.compile(lastNamePattern);
        Matcher matcher =pattern.matcher(lastName);
        if(matcher.matches())                                 //pattern Matches check
        {
            System.out.println("Enter email Id :");
        }
        else
        {
            System.out.println(" invalid Last Name ");
        }
    }
    public static void isValidEmailId()
    {
        String email=sc.nextLine();         //Accept Email id
        String emailPattern="^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";//set pattern for email id
        Pattern pattern= Pattern.compile(emailPattern);
        Matcher matcher =pattern.matcher(email);
        if(matcher.matches())                        //check Input and Pattern
        {
            System.out.println("Enter Phone Number :");
        }
        else
        {
            System.out.println(" invalid Email Id ");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Welcome in User Registraion Program");
        isValidFirstName(); //method call for firstName
        isValidLastName(); //method call for lastname
        isValidEmailId(); //method call for email
    }
}
