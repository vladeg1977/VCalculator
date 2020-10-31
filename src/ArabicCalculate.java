import java.util.ArrayList;

public class ArabicCalculate {
    public static Integer operation(ArrayList<String> list) throws MyException {
        if ("+".equals(list.get(2))) {
            return Integer.parseInt(list.get(0)) + Integer.parseInt(list.get(1));
        }
        if ("-".equals(list.get(2))) {
            return Integer.parseInt(list.get(0)) - Integer.parseInt(list.get(1));
        }
        if ("*".equals(list.get(2))) {
            return Integer.parseInt(list.get(0)) * Integer.parseInt(list.get(1));
        }
        if ("/".equals(list.get(2))) {
            return Integer.parseInt(list.get(0)) / Integer.parseInt(list.get(1));
        }
        else throw new MyException("Error");
    }
}
