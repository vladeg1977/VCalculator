import java.util.ArrayList;
import java.util.Arrays;

public class ParseString {
    public static ArrayList<String> parse(String s) throws MyException {
        s = s.replaceAll(" ", "");
        if (s.split("\\+").length == 2) {
            String[] arr = s.split("\\+");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
            list.add("+");
            return list;
        }
        if (s.split("-").length == 2) {
            String[] arr = s.split("-");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
            list.add("-");
            return list;
        }
        if (s.split("\\*").length == 2) {
            String[] arr = s.split("\\*");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
            list.add("*");
            return list;
        }
        if (s.split("/").length == 2) {
            String[] arr = s.split("/");
            ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
            list.add("/");
            return list;
        }
        else throw new MyException("Error");
    }
}
