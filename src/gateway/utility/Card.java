package gateway.utility;

public class Card {

    private String cardNumber;
    private int cardBankCode;
    private int standardExporterBankCode;
    private String password;


    public Card(String cardNumber) {
        this.cardNumber = cardNumber;
        cardBankCode = getCardBankCode(cardNumber);
        standardExporterBankCode = cardToBankCode(cardBankCode);
    }

    public Card(String cardNumber, String password) {
        if (cardNumber.length() < 6) {
            System.out.println("invalid cardnum");
        }
        this.cardNumber = cardNumber;
        cardBankCode = getCardBankCode(cardNumber);
        standardExporterBankCode = cardToBankCode(cardBankCode);
        this.password = password;
    }

    private int getCardBankCode(String cardNumber) {
        return Integer.parseInt(cardNumber.substring(0, 6));
    }

    public static int cardToBankCode(Integer cardBankCode) {
        int bankCode = BankInformationService.getBankCodeByCardBankNumber(cardBankCode);
        return bankCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardBankCode() {
        return cardBankCode;
    }

    public void setCardBankCode(int cardBankCode) {
        this.cardBankCode = cardBankCode;
    }

    public int getStandardExporterBankCode() {
        return standardExporterBankCode;
    }

    public void setStandardExporterBankCode(int standardExporterBankCode) {
        this.standardExporterBankCode = standardExporterBankCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
