package com.akashmjain;
class Kingdome
{
    private String name;
    private String emblem;
    private String message;

    public Kingdome() {

    }
    public Kingdome(String name, String emblem) {
        this.name = name;
        this.emblem = emblem;
    }
    public String getName() 
    {
        return name;
    }
    public String getEmblem() 
    {
        return emblem;
    }
    public void recieveSecretMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() 
    {
        return  "\n        name: " +this.getName() + 
            ", emblem: " + this.getEmblem();
    }
}