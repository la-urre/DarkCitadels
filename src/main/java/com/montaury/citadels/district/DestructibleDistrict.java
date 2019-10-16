package com.montaury.citadels.district;

public class DestructibleDistrict {
    public DestructibleDistrict(Card card, int destructionCost) {
        this.card = card;
        this.destructionCost = destructionCost;
    }

    public Card card() {
        return card;
    }

    public int destructionCost() {
        return destructionCost;
    }

    private final Card card;
    private final int destructionCost;
}
