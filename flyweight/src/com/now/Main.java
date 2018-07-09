package com.now;

/**
 * @author: hua
 * @create: 2018-07-09 21:53
 */
public class Main {

    public static void main(String[] args) {
        MyCharacterFactory myCharacterFactory = new MyCharacterFactory();
        MyCharacter myCharacter1 = myCharacterFactory.getMyCharacterFactory('a');
        MyCharacter myCharacter2 = myCharacterFactory.getMyCharacterFactory('b');
        MyCharacter myCharacter3 = myCharacterFactory.getMyCharacterFactory('a');
        MyCharacter myCharacter4 = myCharacterFactory.getMyCharacterFactory('c');
        myCharacter1.display();
        myCharacter2.display();
        myCharacter3.display();
        myCharacter4.display();
        System.out.println(myCharacter1.getMyChar() == myCharacter3.getMyChar());
    }

}
