package com.akashmjain;
import java.util.ArrayList;
class Universe {
    private ArrayList<Kingdome> kingdomes;

    public Universe() {
        kingdomes = new ArrayList<Kingdome>();
    }
    public void addKingdome(String kingdomeName, String kingdomeEmblem) {
        kingdomes.add(new Kingdome(kingdomeName, kingdomeEmblem));
    }

    public Kingdome getKingdomeByName(String kingdomeName) {
        for(Kingdome kingdome: kingdomes) {
            // System.out.println(kingdome);
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