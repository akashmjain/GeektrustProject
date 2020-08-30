package com.akashmjain;
import java.util.ArrayList;
class SenderKingdome extends Kingdome {
    // private ArrayList<Kingdome> allys;
    public SenderKingdome(String name, String emblem) {
        super(name, emblem);
        // allys = new ArrayList<Kingdome>();
    }
    public void send(Kingdome kingdome, String secretMessage) {
        kingdome.receive(secretMessage);
    }
}