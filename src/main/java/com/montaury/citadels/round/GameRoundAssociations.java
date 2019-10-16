package com.montaury.citadels.round;

import com.montaury.citadels.character.Character;
import io.vavr.collection.List;
import io.vavr.control.Option;

public class GameRoundAssociations {

    public GameRoundAssociations(List<Group> associations) {
        this.associations = associations;
    }

    public Option<Group> associationToCharacter(Character character) {
        return associations.find(a -> a.character == character);
    }

    public final List<Group> associations;
}
