import java.util.ArrayList;
import java.util.HashMap;


public class RomanCalculate {
    public static String operation(ArrayList<String> list) throws MyException {
        HashMap<String, Integer> map = CheckNumber.numberMap();
        list.set(0, map.get(list.get(0)).toString());
        list.set(1, map.get(list.get(1)).toString());
        Integer res = ArabicCalculate.operation(list);
        return ArabicToRoman.arabicToRoman(res);

    }
}
