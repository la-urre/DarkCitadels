package com.montaury.citadels.character;

import com.montaury.citadels.district.DistrictType;
import io.vavr.control.Option;

public enum Character {
    ASSASSIN(1, "Assassin"),
    THIEF(2, "Thief"),
    MAGICIAN(3, "Magician"),
    KING(4, "King", DistrictType.NOBLE),
    BISHOP(5, "Bishop", DistrictType.RELIGIOUS),
    MERCHANT(6, "Merchant", DistrictType.TRADE),
    ARCHITECT(7, "Architect"),
    WARLORD(8, "Warlord", DistrictType.MILITARY);

    Character(int number, String name)
    {
        this(number, name, null);
    }

    Character(int number, String name, DistrictType associatedDistrictType)
    {
        this.number = number;
        this.name = name;
        this.associatedDistrictType = Option.of(associatedDistrictType);
    }

    public int number() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Option<DistrictType> associatedDistrictType() {
        return associatedDistrictType;
    }

    private final int number;
    private final String name;
    private final Option<DistrictType> associatedDistrictType;
}