package com.akashmjain;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
public class App {
    public static void main(String []args) {
        try {
            String fileName = args[0];
            Universe universe = populateUniverseWithKingdomes();
            ArrayList<Input> kingdomeMessage = getInputsFromFile(fileName, universe);
            SenderKingdome sender =  universe.getSenderKingdomeByName("SPACE");
            ArrayList<Kingdome> allies = new ArrayList<Kingdome>();
            for(Input input : kingdomeMessage) {
                Kingdome kingdome = input.getKingdome();    
                String secretMessage = input.getSecretMessage();

                sender.send(kingdome, secretMessage);
                if(allies.contains(kingdome));
                else if(kingdome.isAllied(sender)) {
                    allies.add(kingdome);
                }
            }
            // printing output here
            if(allies.size() < 3) {
                System.out.println("NONE");
                return;
            }


            System.out.print(sender.getName());
            for(Kingdome kingdome : allies) {
                System.out.print(" "+kingdome.getName());
            }
            
        } catch(Exception e) {
            System.out.println("GIVE PROPER FILENAME AS AN INPUT");
        }
    }
    public static Universe populateUniverseWithKingdomes() {
        Universe universeOfSoutheros = new Universe(); 
        universeOfSoutheros.addKingdome("SPACE",    "GORILLA");
        universeOfSoutheros.addKingdome("LAND",     "PANDA");
        universeOfSoutheros.addKingdome("WATER",    "OCTOPUS");
        universeOfSoutheros.addKingdome("ICE",      "MAMMOTH");
        universeOfSoutheros.addKingdome("AIR",      "OWL");
        universeOfSoutheros.addKingdome("FIRE",     "DRAGON");
        return universeOfSoutheros;
    }
    public static ArrayList<Input> getInputsFromFile(String fileName, Universe universe) throws Exception {
        BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
        ArrayList<Input> kingdomeMessage = new ArrayList<Input>();
        String line;
        while((line = bufferReader.readLine()) != null) {
            String kingdomeName = line.substring(0, line.indexOf(" "));
            String secretMessage = line.substring(line.indexOf(" ") + 1);
            Kingdome kingdome = universe.getKingdomeByName(kingdomeName);
            kingdomeMessage.add(new Input(kingdome, secretMessage));
        }
        return kingdomeMessage;
    }
}
