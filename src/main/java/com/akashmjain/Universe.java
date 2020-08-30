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
            if(kingdome.getName() == kingdomeName) {
                return kingdome;
            }
        }
        return new Kingdome();
    }
}