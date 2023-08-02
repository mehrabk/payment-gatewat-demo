/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import gateway.utility.Card;

public class ParsianBank extends Bank {

    @Override
    public boolean settlementByCard(Card destCard, int amount) {
        System.out.println("Parsian Bank: settlement '" + amount + "' of the '" + destCard + "' is successful.");
        return true;
    }

    @Override
    public boolean withdrawalByCard(Card destCard, int amount) {
        System.out.println("Parsian Bank: withdrawal '" + amount + "' of the '" + destCard + "' is successful.");
        return true;
    }

}
