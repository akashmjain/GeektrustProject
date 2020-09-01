package com.akashmjain.core;

public class Kingdom {
    private String name;
    private String emblem;
    public Kingdom() {}
    public Kingdom(String name, String emblem) {
        this.name = name;
        this.emblem = emblem;
    }
    public String getName() { return name; }
    public String getEmblem() { return emblem; }

    @Override public String toString() { return  name; }
}