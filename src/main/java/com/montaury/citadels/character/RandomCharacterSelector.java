package com.montaury.citadels.character;

import io.vavr.collection.List;

import java.util.Random;

public class RandomCharacterSelector {

    public Character among(List<Character> characters) {
        return characters.get(random.nextInt(characters.size()));
    }

    private final Random random = new Random();
}
