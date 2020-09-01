package com.akashmjain.core;
import java.util.ArrayList;
public class Universe {
    private ArrayList<Kingdom> kingdoms;
    public Universe() {
        kingdoms = new ArrayList<Kingdom>();
    }
    public void addKingdom(Kingdom kingdom) { 
        kingdoms.add(kingdom);
    }
    public Kingdom getKingdomByName(String kingdomName) {
        for(Kingdom kingdom: kingdoms) {
            if(kingdom.getName().equals(kingdomName)) {
                return kingdom;
            }
        }
        return new Kingdom();
    }
    @Override public String toString() { return kingdoms.toString(); }
}