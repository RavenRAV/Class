package com.company;

public class Door {
    public Door[] generateHero(){
        Door[] heArr = new Door[4];
        Door warrior = new Door();
        Door magician = new Door();
        Door magicianHil = new Door();
        Door kinetik = new Door();
        heArr[0] = warrior;
        heArr[1] = magician;
        heArr[2] = magicianHil;
        heArr[3] = kinetik;

        return heArr;
    }
}

