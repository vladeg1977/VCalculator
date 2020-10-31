import java.util.ArrayList;


public class Calculate {
    public static String calculate(String s) {
        try {
            ArrayList<String> list = ParseString.parse(s);
            if (CheckNumber.check(list).get(3).equals("roman")) {
                return RomanCalculate.operation(list);
            }
            else if (CheckNumber.check(list).get(3).equals("arabic")) {
                return ArabicCalculate.operation(list).toString();
            }

        }
        catch (MyException exception) {
            exception.printStackTrace();
        }
        return null;
    }

}
