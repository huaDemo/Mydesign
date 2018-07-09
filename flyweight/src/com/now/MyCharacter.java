package com.now;

/**
 * @author: hua
 * @create: 2018-07-09 21:45
 */
public class MyCharacter {

    private char myChar;

    public MyCharacter(char myChar) {
        this.myChar = myChar;
    }

    public void display() {
        System.out.println(this.myChar);
    }

    public char getMyChar() {
        return myChar;
    }

    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }
}
