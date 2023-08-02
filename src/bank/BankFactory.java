package bank;

public class BankFactory {
    public static Bank getBankByStandardBankCode(int standardBankCode) {
        Bank bank = null;
        switch (standardBankCode) {
            case 55:
                bank = new EghtesadNovinBank();
                break;
            case 14:
                bank = new MaskanBank();
                break;
            case 12:
                bank = new MellatBank();
                break;
            case 17:
                bank = new MelliBank();
                break;
            case 54:
                bank = new ParsianBank();
                break;
            case 57:
                bank = new PasargadBank();
                break;
        }
        return bank;
    }
}
