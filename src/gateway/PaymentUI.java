package gateway;

import gateway.utility.Card;

import java.util.Scanner;

public class PaymentUI {
    public static void showPaymentGatewayUI(String destCardNumber, int amount){
        Scanner sc;
        sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Payment Gateway Exercise");
        System.out.println("===================================");
        System.out.println("supported bank is: Eghtesad novin, maskan, mellat, melli, parsian, and pasargad.");
        System.out.println("payment destination card number is:" + destCardNumber);
        System.out.println("payment amount is:" + amount);
        System.out.println("are you confirm this information?");
        System.out.println("1.Yes");
        int confirmation = sc.nextInt();
        if(confirmation == 1) {
            System.out.println("");
            System.out.println("Enter your card number:");
            String sourceCardNumber = sc.next();
            System.out.println("");
            System.out.println("Enter your password:");
            String password = sc.next();
            Card sourceCard = new Card(sourceCardNumber, password);
            Card destCard = new Card(destCardNumber);
            PaymentService.fundTransferByCardNumber(sourceCard, destCard, amount);
        }

    }
}
