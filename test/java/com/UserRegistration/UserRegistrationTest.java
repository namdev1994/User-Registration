package com.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void testFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean check = false;
        check = userRegistration.isValidName("Saurabh");
        Assertions.assertTrue(check);
    }
//
//    @Test
//    public void testfirstNameFalse() {
//        UserRegistration userRegistration = new UserRegistration();
//        boolean suraj = false;
//        try {
//            suraj = userRegistration.isValidFirstName("Suraj");
//        } catch (UserRegistrationException e) {
//            e.printStackTrace();
//        }
//        Assertions.assertEquals(false,suraj);
//    }
//
//    @Test
//    public void testLastNameTrue() {
//        UserRegistration userRegistration = new UserRegistration();
//        boolean suraj = false;
//        try {
//            suraj = userRegistration.isValidLastName("Rathod");
//        } catch (UserRegistrationException e) {
//            e.printStackTrace();
//        }
//        Assertions.assertEquals(true,suraj);
//    }
//
//    @Test
//    void testLastNameFalse() {
//        UserRegistration userRegistration = new UserRegistration();
//        boolean suraj = false;
//        try {
//            suraj = userRegistration.isValidLastName("rathod");
//        } catch (UserRegistrationException e) {
//            e.printStackTrace();
//        }
//        Assertions.assertEquals(false,suraj);
//    }
//
//    @Test
//    void testEmailIdTrue() {
//        UserRegistration userRegistration = new UserRegistration();
//        boolean email = false;
//        try {
//            email = userRegistration.isValidEmailId("namdev@gmail.cm");
//        } catch (UserRegistrationException e) {
//            e.printStackTrace();
//        }
//        Assertions.assertEquals(true,email);
//    }
//
//    @Test
//    void testEmailIdFalse() {
//        UserRegistration userRegistration = new UserRegistration();
//        boolean email = false;
//        try {
//            email = userRegistration.isValidEmailId("namdev@gmail.cm");
//        } catch (UserRegistrationException e) {
//            e.printStackTrace();
//        }
//        Assertions.assertEquals(false,email);
//
//    }
//
//    @Test
//    void testPhoneNumberTrue() {
//        UserRegistration userRegistration = new UserRegistration();
//        boolean email = false;
//        try {
//            email = userRegistration.isValidPhoneNumber("91 8080808080");
//        } catch (UserRegistrationException e) {
//            e.printStackTrace();
//        }
//        Assertions.assertEquals(true,email);
//    }
//
//    @Test
//    void testPhoneNumberFalse() {
//        UserRegistration userRegistration = new UserRegistration();
//        boolean email = false;
//        try {
//            email = userRegistration.isValidPassword("918080808080");
//        } catch (UserRegistrationException e) {
//            e.printStackTrace();
//        }
//        Assertions.assertEquals(true,email);
//    }
}
