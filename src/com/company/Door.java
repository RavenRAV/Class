package com.company;

public class Door {
    public Hero[] generateHero(){
        Hero[] heArr = new Hero[4];
        Hero warrior = new Hero(250,20,1);
        Hero magician = new Hero(230,25,2);
        Hero magicianHil = new Hero(200,10,3);
        Hero kinetik = new Hero(240,24,2);
        heArr[0] = warrior;
        heArr[1] = magician;
        heArr[2] = magicianHil;
        heArr[3] = kinetik;

        return heArr;
    }
}

