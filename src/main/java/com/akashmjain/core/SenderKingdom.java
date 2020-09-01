package com.akashmjain.core;
import java.util.ArrayList;
public class SenderKingdom extends Kingdom {
    private ArrayList<Kingdom> alliance;
    public SenderKingdom(String name, String emblem) {
        super(name, emblem);
        alliance = new ArrayList<Kingdom>();
    }
    public void send(ReciverKingdom kingdom, String secretMessage) {
        kingdom.receive(secretMessage, this);
        if(!alliance.contains(kingdom) && kingdom.isAllied(this)) {
            alliance.add(kingdom);
        }
    }
    public ArrayList<Kingdom> getAllianceArray() { return alliance; }
}