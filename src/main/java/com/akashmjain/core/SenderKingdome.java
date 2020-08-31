package com.akashmjain.core;
import java.util.ArrayList;
public class SenderKingdome extends Kingdome {
    public SenderKingdome(String name, String emblem) {
        super(name, emblem);
    }
    public void send(ReciverKingdome kingdome, String secretMessage) {
        kingdome.receive(secretMessage, this);
    }
}