package com.now;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: hua
 * @create: 2018-07-09 21:47
 */
public class MyCharacterFactory {

    private Map<Character, MyCharacter> pool;

    public MyCharacterFactory() {
        this.pool = new HashMap<Character, MyCharacter>();
    }

    public MyCharacter getMyCharacterFactory(Character character) {
        MyCharacter myChar = pool.get(character);
        if (myChar == null) {
            myChar = new MyCharacter(character);
        }
        return myChar;
    }

}
