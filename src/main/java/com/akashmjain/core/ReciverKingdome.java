package com.akashmjain.core;
public class ReciverKingdome extends Kingdome {
    private String secretMessage;
    private SenderKingdome senderKingdome;

    public ReciverKingdome(String kingdomeName, String emblem) {
        super(kingdomeName, emblem);
    }
    public void receive(String secretMessage, SenderKingdome senderKingdome) {
        this.secretMessage = secretMessage;
        this.senderKingdome = senderKingdome;
    }

    public boolean isAllied(SenderKingdome senderKingdome) {
        if(senderKingdome != this.senderKingdome) { return false; }
        Cipher encryption = new Cipher(); 
        // passing key and message both as emblems
        encryption.seasarCipherEncryptinoAlgorithm(this.getEmblem(), this.getEmblem());
        String encryptedEmblem = encryption.getEncryptedData();
        for(int i = 0; i < encryptedEmblem.length(); i++)
        {
            int index = secretMessage.indexOf(encryptedEmblem.charAt(i));
            if(index == -1) { return false; }
            // masking the char which is already matched by $.
            secretMessage = secretMessage.substring(0, index) + '$' + secretMessage.substring(index + 1); 
        }
        return true;
    }
}