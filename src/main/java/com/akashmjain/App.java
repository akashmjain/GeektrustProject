package com.akashmjain;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
public class App {
    public static void main(String []args) {
        try {
            String fileName = args[0];
            // kingdome to message mapping
            HashMap<String, String> kingdomeMessage = getInputsFromFile(fileName);
            Universe universe = populateUniverseWithKingdomes();
            Kingdome sender = universe.getKingdomeByName("SPACE");
            System.out.println(kingdomeMessage);
            
        } catch(Exception e) {
            System.out.println("GIVE PROPER FILENAME AS AN INPUT");
        }
    }
    public static Universe populateUniverseWithKingdomes() {
        Universe universeOfSoutheros = new Universe(); 
        // addKingdome method takes two inputs 1st name of kingdome and 2nd emblem of kingdome.
        universeOfSoutheros.addKingdome("SPACE",    "GORILLA");
        universeOfSoutheros.addKingdome("LAND",     "PANDA");
        universeOfSoutheros.addKingdome("WATER",    "OCTOPUS");
        universeOfSoutheros.addKingdome("ICE",      "MAMMOTH");
        universeOfSoutheros.addKingdome("AIR",      "OWL");
        universeOfSoutheros.addKingdome("FIRE",     "DRAGON");

        return universeOfSoutheros;
    }

    // getting input from a given file in below 3 methods.
    public static HashMap<String, String> getInputsFromFile(String fileName) throws Exception {
        HashMap<String, String> kingdomeMessage = new HashMap<String, String>();
        BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = bufferReader.readLine()) != null) {
            kingdomeMessage.put(getKingdomeName(line), getSecretMessage(line));
        }
        return kingdomeMessage;
    }
    private static String getKingdomeName(String line) {
        return line.substring(0, line.indexOf(" "));
    }

    private static String getSecretMessage(String line) {
        return line.substring(line.indexOf(" ") + 1);
    }

    /*public static void main(String[] args) {   
        try {
            ArrayList<UserInput> inputs = UserInput.getInputsFromFile(args[0]);
            Resolve resolve = new Resolve(inputs);
            ArrayList<Kingdome> alliance = resolve.getAllianceArray();
            if(alliance.size() > 3) {
                for (Kingdome ally : alliance) {
                    System.out.print(ally.getKingdomeName()+" ");
            }
            System.out.println();
            }
            else {
                System.out.println("NONE");
            }
        }
        catch(Exception e) {
            System.out.println("please give proper file name");
        }
    }*/   
}
