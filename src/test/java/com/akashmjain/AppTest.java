
package com.akashmjain.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test 
    public void testReciversIsAlliedMethod() {
        // test case for sending and reciving and checking messages.
        ReciverKingdom reciverKingdom = new ReciverKingdom("LAND", "PANDA");
        SenderKingdom kingdom = new SenderKingdom("SPACE", "GORILLA");
        assertEquals(false, reciverKingdom.isAllied(kingdom));

        String secretMessage = "FDIXXSOKKOFBBMU";
        kingdom.send(reciverKingdom, secretMessage);

        assertEquals(true, reciverKingdom.isAllied(kingdom));
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
