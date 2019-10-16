package com.montaury.citadels;

import com.montaury.citadels.district.Card;
import io.vavr.Tuple2;
import io.vavr.collection.HashSet;
import io.vavr.collection.List;
import io.vavr.collection.Queue;
import io.vavr.collection.Set;
import io.vavr.control.Option;

public class CardPile {

    public static CardPile empty() {
        return new CardPile(List.empty());
    }

    CardPile(List<Card> cards) {
        this.cards = Queue.ofAll(cards);
    }

    public boolean canDraw(int number) {
        return cards.size() >= number;
    }

    public Option<Card> draw() {
        Option<Tuple2<Card, Queue<Card>>> dequeueResult = cards.dequeueOption();
        cards = dequeueResult.map(Tuple2::_2).getOrElse(cards);
        return dequeueResult.map(Tuple2::_1);
    }

    public Set<Card> draw(int number) {
        Set<Card> drawn = HashSet.empty();
        for (int i = 0; i < number; i++) {
            drawn = drawn.addAll(draw());
        }
        return drawn;
    }

    public void discard(Card card) {
        discard(List.of(card));
    }

    public void discard(List<Card> cards) {
        this.cards = this.cards.enqueueAll(cards);
    }

    public Set<Card> swapWith(List<Card> cardsToDiscard) {
        Set<Card> drawnCards = draw(cardsToDiscard.size());
        discard(cardsToDiscard);
        return drawnCards;
    }

    private Queue<Card> cards;
}
