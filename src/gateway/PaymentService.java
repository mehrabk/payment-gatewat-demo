package gateway;

import bank.Bank;
import bank.BankFactory;
import gateway.utility.Card;

public class PaymentService {
    public static void fundTransferByCardNumber(Card source, Card destination, int amount) {

        int sourceStandardBankCode;
        sourceStandardBankCode = source.getStandardExporterBankCode();
        Bank sourceBank;
        sourceBank = BankFactory.getBankByStandardBankCode(sourceStandardBankCode);

        int destStandardBankCode;
        destStandardBankCode = destination.getStandardExporterBankCode();
        Bank destBank;
        destBank = BankFactory.getBankByStandardBankCode(destStandardBankCode);

        boolean sourceWithdrawalResult;
        sourceWithdrawalResult = sourceBank.withdrawalByCard(source, amount);
        if (sourceWithdrawalResult) {
            boolean destSettlementResult;
            destSettlementResult = destBank.settlementByCard(destination, amount);
            if (destSettlementResult) {
            } else {
                while (!sourceBank.settlementByCard(source, amount)) {
                }
            }
        }

    }

    public static boolean isSupportBankService(int StandardBankCode) {
        switch (StandardBankCode) {
            case 55:
            case 14:
            case 12:
            case 17:
            case 54:
            case 57:
                return true;
        }
        return false;

    }
}
