import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.lang.Character;

public class Main {
    public static String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static void main(String[] args) {


        char[] simbols = TEXT
                .toLowerCase(Locale.ROOT)
                .toCharArray();


        Map<Character, Integer> map = new HashMap<>();

        for (Character currentMap : simbols)
            if (currentMap != ' ') {
                map.merge(currentMap, 1, (currentValue, defaultValue) -> ++currentValue);
                System.out.println(map);

            }





    }




}