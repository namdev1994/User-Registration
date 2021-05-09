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
    public static void main(String args[])
    {
        System.out.println("Welcome in User Registraion Program");
        isValidFirstName(); //method call
    }
}
