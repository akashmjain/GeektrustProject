package com.akashmjain.core;

public class Kingdome {
    private String name;
    private String emblem;
    // private String secretMessage;
    // private SenderKingdome senderKingdome;


    public Kingdome() {}
    public Kingdome(String name, String emblem) {
        this.name = name;
        this.emblem = emblem;
    }
    public String getName() { return name; }
    public String getEmblem() { return emblem; }

    @Override public String toString() { return  name; }
}