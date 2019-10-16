package com.montaury.citadels;

import com.montaury.citadels.district.Card;
import io.vavr.collection.Set;

public class Possession {
    public final int gold;
    public final Set<Card> hand;

    public Possession(int gold, Set<Card> hand) {
        this.gold = gold;
        this.hand = hand;
    }

    public int goldCoins() {
        return gold;
    }

    public int cardsInHandCount() {
        return hand.size();
    }
}
