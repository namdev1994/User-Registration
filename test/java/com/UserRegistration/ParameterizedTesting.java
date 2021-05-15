package com.UserRegistration;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTesting {
    public String email;
    public boolean expectedResult;
    public UserRegistration userRegistration;
    public ParameterizedTesting(String email, boolean expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] {
                { "xyz@yahoo.com", true },
                { "xyz-100@yahoo.com" , true },
                { "xyz.100@yahoo.com" , true },
                { "xyz111@abc.net" , true },
                { "xyz-100@abc.net" , true },
                { "xyz.100@abc.com.au" , true },
                { "xyz@1.com" , true },
                { "xyz@gmail.com.com" , true },
                { "xyz+100@gmail.com" , true }});
    }
    @Test
    public void checkEmailValidOrNot() {
        System.out.println("This is Expected Result"+ this.expectedResult);
        Assertions.assertEquals(this.expectedResult, userRegistration.isValidEmailId(this.email));
    }

}
