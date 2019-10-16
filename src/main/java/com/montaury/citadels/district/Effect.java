package com.montaury.citadels.district;

import com.montaury.citadels.Possession;
import com.montaury.citadels.character.Character;
import io.vavr.control.Option;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Effect {

    public static Effect none() {
        return new Effect(false);
    }

    public static Effect indestructible() {
        return new Effect(true);
    }

    private Effect(boolean indestructible) {
        this.indestructible = indestructible;
    }

    public boolean isIndestructible() {
        return indestructible;
    }









    private final boolean indestructible;
}
