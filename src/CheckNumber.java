import java.util.ArrayList;
import java.util.HashMap;

public class CheckNumber {
    public static HashMap<String, Integer> numberMap() {
        String[] arr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        HashMap<String, Integer> map = new HashMap<>();
        int i = 1;
        for (String element : arr) {
            map.put(element, i);
            i++;
        }
        return map;
    }
    public static ArrayList<String> check(ArrayList<String> list) throws MyException {
        HashMap<String, Integer> map = numberMap();
        if (map.containsKey(list.get(0)) & map.containsKey(list.get(1))) {
            list.add(3, "roman");
            return list;
        }
        try {
            if (map.containsValue(Integer.parseInt(list.get(0))) & map.containsValue(Integer.parseInt(list.get(1)))) {
                list.add(3, "arabic");
                return list;
            }
            else if (Integer.parseInt(list.get(0))<1 || Integer.parseInt(list.get(0))>10 || Integer.parseInt(list.get(1))<1 || Integer.parseInt(list.get(1))>10) {
                    throw new MyException("Error");
            }
        }
        catch (NumberFormatException e) {
            throw new MyException("Error");
        }
        return list;
    }
}
