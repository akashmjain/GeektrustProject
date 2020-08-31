package com.akashmjain.core;
import java.util.ArrayList;
public class Universe {
    private ArrayList<Kingdome> kingdomes;
    public Universe() {
        kingdomes = new ArrayList<Kingdome>();
    }
    // public void addKingdome(String kingdomeName, String kingdomeEmblem) {
    //     kingdomes.add(new Kingdome(kingdomeName, kingdomeEmblem));
    // }
    public void addKingdome(Kingdome kingdome) { 
        kingdomes.add(kingdome); 
    }
    public Kingdome getKingdomeByName(String kingdomeName) {
        for(Kingdome kingdome: kingdomes) {
            if(kingdome.getName().equals(kingdomeName)) {
                return kingdome;
            }
        }
        return new Kingdome();
    }
    public SenderKingdome getSenderKingdomeByName(String kingdomeName) {
        Kingdome kingdome = getKingdomeByName(kingdomeName);
        return new SenderKingdome(kingdome.getName(),kingdome.getEmblem());
    }
    @Override public String toString() { return kingdomes.toString(); }
}