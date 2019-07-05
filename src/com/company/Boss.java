package com.company;

public class Boss {
    private int health;
    private int hits;
    private int defenceType;

    public Boss(int health, int hits, int defenceType){
        this.setHealth(health);
        this.setHits(hits);
        this.setDefenceType(defenceType);

    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }
}
