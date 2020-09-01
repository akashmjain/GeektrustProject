package com.akashmjain;
import com.akashmjain.core.*;
import com.akashmjain.input_formatting.Input;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;



public class App {
    public static void main(String []args) {
        try {
            String fileName = args[0]; 
            Universe universe = populateUniverseWithKingdomes(); 
            SenderKingdome senderKingdome = (SenderKingdome) universe.getKingdomeByName("SPACE");
            Resolve resolve = new Resolve(universe, fileName, senderKingdome);

            System.out.println(resolve);


        } catch(Exception e) {
            System.out.println("GIVE PROPER FILENAME AS AN INPUT");
            System.out.println(e);
        }
    }
    public static Universe populateUniverseWithKingdomes() {
        Universe universeOfSoutheros = new Universe(); 
        universeOfSoutheros.addKingdome(new SenderKingdome("SPACE", "GORILLA"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("LAND", "PANDA"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("WATER", "OCTOPUS"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("ICE", "MAMMOTH"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("AIR", "OWL"));
        universeOfSoutheros.addKingdome(new ReciverKingdome("FIRE", "DRAGON"));
        return universeOfSoutheros;
    }
}
