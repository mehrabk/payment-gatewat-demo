package bank;

import gateway.utility.Card;

public abstract class Bank {
    public abstract boolean settlementByCard(Card destCard, int amount);
    public abstract boolean withdrawalByCard(Card destCard, int amount);
}
