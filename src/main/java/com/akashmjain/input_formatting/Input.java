package com.akashmjain.input_formatting;
import  com.akashmjain.core.Kingdom;

public class Input {
    private Kingdom kingdom;
    private String secretMessage;
    public Input(Kingdom kingdom, String secretMessage) {
        this.kingdom = kingdom;
        this.secretMessage = secretMessage;
    }
    public Kingdom getKingdom() { return kingdom; }
    public String getSecretMessage() { return secretMessage; }
    @Override public String toString() { return kingdom + " : " + secretMessage; }
}