package com.akashmjain.core;
public class ReciverKingdom extends Kingdom {
    private String secretMessage;
    private SenderKingdom senderKingdom;

    public ReciverKingdom(String KingdomName, String emblem) {
        super(KingdomName, emblem);
    }
    public void receive(String secretMessage, SenderKingdom senderKingdom) {
        this.secretMessage = secretMessage;
        this.senderKingdom = senderKingdom;
    }
    
    /*
    * Here using reverse approace instead of decrypting message we are decrypting the key itself and finding the match.
    */ 
    public boolean isAllied(SenderKingdom senderKingdom) {
        String secretMessage = this.secretMessage;
        
        if(senderKingdom != this.senderKingdom) { return false; }
        Cipher encryption = new Cipher(); 
        encryption.seasarCipherEncryptinoAlgorithm(this.getEmblem(), this.getEmblem());
        String encryptedEmblem = encryption.getEncryptedData();
        for(int i = 0; i < encryptedEmblem.length(); i++)
        {
            int index = secretMessage.indexOf(encryptedEmblem.charAt(i));
            if(index == -1) { return false; }
            secretMessage = secretMessage.substring(0, index) + '$' + secretMessage.substring(index + 1); 
        }
        return true;
    }
}