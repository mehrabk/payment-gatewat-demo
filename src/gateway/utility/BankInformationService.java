package gateway.utility;

import java.util.HashMap;
import java.util.Map;

public class BankInformationService {
    private static final Map<Integer, Integer> cardBankMap;
    private static final Map<Integer, String> bankCodeMap;
    static {
        cardBankMap = new HashMap<>();
        cardBankMap.put(170019, 17);
        cardBankMap.put(207177, 20);
        cardBankMap.put(502229, 57);
        cardBankMap.put(502806, 61);
        cardBankMap.put(502908, 22);
        cardBankMap.put(502938, 66);
        cardBankMap.put(504706, 61);
        cardBankMap.put(505416, 64);
        cardBankMap.put(505785, 69);
        cardBankMap.put(505809, 78);
        cardBankMap.put(589210, 15);
        cardBankMap.put(589463, 13);
        cardBankMap.put(603769, 19);
        cardBankMap.put(603770, 16);
        cardBankMap.put(603799, 170);
        cardBankMap.put(610433, 12);
        cardBankMap.put(621986, 56);
        cardBankMap.put(622106, 54);
        cardBankMap.put(627353, 18);
        cardBankMap.put(627412, 55);
        cardBankMap.put(627488, 53);
        cardBankMap.put(627648, 20);
        cardBankMap.put(627884, 54);
        cardBankMap.put(627961, 11);
        cardBankMap.put(628023, 14);
        cardBankMap.put(639346, 59);
        cardBankMap.put(639347, 57);
        cardBankMap.put(639607, 58);

        bankCodeMap = new HashMap();
        bankCodeMap.put(11, "صنعت و معدن");
        bankCodeMap.put(12, "ملت");
        bankCodeMap.put(13, "رفاه");
        bankCodeMap.put(14, "مسکن");
        bankCodeMap.put(15, "سپه");
        bankCodeMap.put(16, "کشاورزي");
        bankCodeMap.put(17, "ملی");
        bankCodeMap.put(18, "تجارت");
        bankCodeMap.put(19, "صادرات");
        bankCodeMap.put(20, "توسعه صادرات");
        bankCodeMap.put(22, "توسعه تعاون");
        bankCodeMap.put(53, "کارآفرين");
        bankCodeMap.put(54, "پارسيان");
        bankCodeMap.put(55, "اقتصاد نوين");
        bankCodeMap.put(56, "سامان");
        bankCodeMap.put(57, "پاسارگاد");
        bankCodeMap.put(58, "سرمايه");
        bankCodeMap.put(59, "سينا");
        bankCodeMap.put(61, "شهر");
        bankCodeMap.put(64, "گردشگري");
        bankCodeMap.put(66, "دي");
        bankCodeMap.put(69, "ايران زمين");
        bankCodeMap.put(78, "خاورميانه");
        bankCodeMap.put(170, "ملي جديد");
    }
    public static int getBankCodeByCardBankNumber(int inputCardBankNumber) {
            return cardBankMap.get(inputCardBankNumber);
    }

    public static String getBankNameByStandardBankCode(int inputStandardBankCode) {
        return bankCodeMap.get(inputStandardBankCode);
    }
}
