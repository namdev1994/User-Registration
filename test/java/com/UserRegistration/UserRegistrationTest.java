package com.UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void testFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean suraj = userRegistration.isValidFirstName("Suraj");
        Assertions.assertEquals(true,suraj);
    }

    @Test
    public void testfirstNameFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean suraj = userRegistration.isValidFirstName("Suraj");
        Assertions.assertEquals(false,suraj);
    }

    @Test
    public void testLastNameTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean suraj = userRegistration.isValidLastName("Rathod");
        Assertions.assertEquals(true,suraj);
    }

    @Test
    void testLastNameFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean suraj = userRegistration.isValidLastName("rathod");
        Assertions.assertEquals(false,suraj);
    }

    @Test
    void testEmailIdTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.isValidEmailId("namdev@gmail.cm");
        Assertions.assertEquals(true,email);
    }

    @Test
    void testEmailIdFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.isValidEmailId("namdev@gmail.cm");
        Assertions.assertEquals(false,email);

    }

    @Test
    void testPhoneNumberTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.isValidPhoneNumber("91 8080808080");
        Assertions.assertEquals(true,email);
    }

    @Test
    void testPhoneNumberFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.isValidPassword("918080808080");
        Assertions.assertEquals(true,email);
    }
}
