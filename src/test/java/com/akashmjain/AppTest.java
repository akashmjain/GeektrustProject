
package com.akashmjain.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
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

    @Test 
    public void testDecryption() {
        Cipher cipher = new Cipher();
        cipher.seasarCipherDecryptionAlgorithm("OWL","ROZO");
        String plainText = cipher.getDecryptedData();
        assertEquals(true, plainText.equals("OLWL"));

    } 
    
    @Test 
    public void testEncryption() {
        Cipher cipher = new Cipher();
        cipher.seasarCipherEncryptinoAlgorithm("OWL","OLWL");
        String plainText = cipher.getEncryptedData();
        assertEquals(true, plainText.equals("ROZO"));
    }


}
