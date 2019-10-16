package com.montaury.citadels;

import io.vavr.control.Option;

public class Board {
    private Option<City> firstCompleteCity = Option.none();

    public void mark(City city) {
        firstCompleteCity = firstCompleteCity.orElse(() -> Option.of(city));
    }

    public boolean isFirst(City city) {
        return firstCompleteCity.contains(city);
    }
}
