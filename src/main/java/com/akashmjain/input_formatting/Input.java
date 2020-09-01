package com.akashmjain.input_formatting;
import  com.akashmjain.core.Kingdome;

public class Input {
    private Kingdome kingdome;
    private String secretMessage;
    public Input(Kingdome kingdome, String secretMessage) {
        this.kingdome = kingdome;
        this.secretMessage = secretMessage;
    }
    public Kingdome getKingdome() { return kingdome; }
    public String getSecretMessage() { return secretMessage; }
    @Override public String toString() { return kingdome + " : " + secretMessage; }
}