import java.util.List;

public class ArabicToRoman {
    public static String arabicToRoman(Integer arabic) {
        StringBuilder result = new StringBuilder();
        if (arabic<0) {
            arabic = Math.abs(arabic);
            result.append("-");
        }
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();
        int i = 0;
        while (arabic>0) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (symbol.getValue()<=arabic) {
                result.append(symbol);
                arabic=arabic-symbol.getValue();
            }
            else {
                i++;
            }
        }
        return result.toString();
    }
}
