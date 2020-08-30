package com.akashmjain;
class Input {
    // private String kingdomeName;
    private Kingdome kingdome;
    private String secretMessage;
    public Input(Kingdome kingdome, String secretMessage) {
        // this.kingdomeName = kingdomeName;
        this.kingdome = kingdome;
        this.secretMessage = secretMessage;
    }
    // public String getKingdomeName() { return kingdomeName; }
    public Kingdome getKingdome() { return kingdome; }
    public String getSecretMessage() { return secretMessage; }

    // @Override public String toString() { return kingdomeName + " : " + secretMessage; }
    @Override public String toString() { return kingdome + " : " + secretMessage; }
}