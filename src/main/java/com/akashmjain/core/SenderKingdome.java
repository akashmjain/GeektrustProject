package com.akashmjain.core;
import java.util.ArrayList;
public class SenderKingdome extends Kingdome {
    private ArrayList<Kingdome> alliance;
    public SenderKingdome(String name, String emblem) {
        super(name, emblem);
        alliance = new ArrayList<Kingdome>();
    }
    public void send(ReciverKingdome kingdome, String secretMessage) {
        kingdome.receive(secretMessage, this);
        if(!alliance.contains(kingdome) && kingdome.isAllied(this)) {
            alliance.add(kingdome);
        }
    }
    public ArrayList<Kingdome> getAllianceArray() { return alliance; }
}