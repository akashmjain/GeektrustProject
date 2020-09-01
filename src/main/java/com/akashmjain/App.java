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
            Universe universe = populateUniverseWithKingdoms(); 
            SenderKingdom senderKingdom = (SenderKingdom) universe.getKingdomByName("SPACE");
            Resolve resolve = new Resolve(universe, fileName, senderKingdom);
            System.out.println(resolve);

            test();

        } catch(Exception e) {
            System.out.println("GIVE PROPER FILENAME AS AN INPUT");
            System.out.println(e);
        }
    }
    public static void test() {
    }

    public static Universe populateUniverseWithKingdoms() {
        Universe universeOfSoutheros = new Universe(); 
        universeOfSoutheros.addKingdom(new SenderKingdom("SPACE", "GORILLA"));
        universeOfSoutheros.addKingdom(new ReciverKingdom("LAND", "PANDA"));
        universeOfSoutheros.addKingdom(new ReciverKingdom("WATER", "OCTOPUS"));
        universeOfSoutheros.addKingdom(new ReciverKingdom("ICE", "MAMMOTH"));
        universeOfSoutheros.addKingdom(new ReciverKingdom("AIR", "OWL"));
        universeOfSoutheros.addKingdom(new ReciverKingdom("FIRE", "DRAGON"));
        return universeOfSoutheros;
    }
}
