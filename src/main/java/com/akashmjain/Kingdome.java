package com.akashmjain;

class Kingdome {
    private String name;
    private String emblem;
    private String secretMessage;
    private Kingdome ally = null;

    public Kingdome() {}
    public Kingdome(String name, String emblem) {
        this.name = name;
        this.emblem = emblem;
    }
    public String getName() { return name; }
    public String getEmblem() { return emblem; }
    public void receive(String secretMessage) {
        this.secretMessage = secretMessage;
    }
    public boolean isAllied(SenderKingdome senderKingdome) {
        String encryptedEmblem = getEncryptedEmblem();
        for(int i = 0; i < encryptedEmblem.length(); i++)
        {
            int index = secretMessage.indexOf(encryptedEmblem.charAt(i));
            if(index == -1)
            {   
                return false;
            }
            secretMessage = secretMessage.substring(0, index) + '$' + secretMessage.substring(index + 1); 
        }
        return true;
    }
    private String getEncryptedEmblem() {
        String key = "";
        int len = emblem.length();

        for (int i = 0; i < emblem.length(); i++) {
            if(emblem.charAt(i) == ' ') {
                key = key + ' ';        
            }
            else {
                if ((emblem.charAt(i) + len) > 90) {
                    int t = (emblem.charAt(i) + len) - 91;
                    key = key + (char)(t + 'A');
                }
                else 
                {
                    key = key + (char)(emblem.charAt(i) + len);     
                }
            }
        }
        return key;
    }
    
    @Override public String toString() { return  name; }
}