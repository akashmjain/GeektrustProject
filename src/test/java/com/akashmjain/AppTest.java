
package com.akashmjain.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test 
    public void testAppHasAGreeting() {
        // App classUnderTest = new App();

        // assertNotNull("app should have a greeting", classUnderTest.getGreeting("Akash"));
    }
    @Test 
    public void testReciversIsAlliedMethod() {
        // test case for sending and reciving and checking messages.

        ReciverKingdome reciverKingdome = new ReciverKingdome("LAND", "PANDA");
        SenderKingdome kingdome = new SenderKingdome("SPACE", "GORILLA");
        assertEquals(false, reciverKingdome.isAllied(kingdome));
        String secretMessage = "FDIXXSOKKOFBBMU";
        kingdome.send(reciverKingdome, secretMessage);
        assertEquals(true, reciverKingdome.isAllied(kingdome));
    }
    

}
