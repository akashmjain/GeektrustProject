package com.akashmjain.core;
public class Cipher {
    // we can add multiple different algos here 
    private String encryptedData;
    private String decryptedData;
    private String key;
    public void seasarCipherEncryptinoAlgorithm(String key, String message) {

        String encryptedMessage = "";
        int len = key.length();
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' ') { 
                encryptedMessage = encryptedMessage + ' '; 
            }
            else if ((message.charAt(i) + len) > 90) {
                    int t = (message.charAt(i) + len) - 91;
                    encryptedMessage = encryptedMessage + (char)(t + 'A');
            }    
            else {
                encryptedMessage = encryptedMessage + (char)(message.charAt(i) + len);     
            }
        }
        this.encryptedData = encryptedMessage;
    }
    public void seasarCipherDecryptionAlgorithm(String key, String message) {
        String decryptedMessage = "";
        int len = key.length();

        for(int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' ') {
                decryptedMessage = decryptedMessage + ' ';
            }
            else if ((message.charAt(i) - len ) < 'A' ) {
                int difference = 'A' - (message.charAt(i) - len );
                decryptedMessage = decryptedMessage + (char) ('Z' -  difference );
            }
            else {
                decryptedMessage = decryptedMessage + (char)(message.charAt(i) - len);
            }
        }
        this.decryptedData = decryptedMessage;

    }
    public String getDecryptedData() { return decryptedData; }
    public String getEncryptedData() { return encryptedData; }
}