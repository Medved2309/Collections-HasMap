

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
            if (currentMap != ' ' && Character.isLetter(currentMap)) {
                map.merge(currentMap, 1, (currentValue, defaultValue) -> ++currentValue);
            }

        System.out.println(map);
        Map.Entry<Character, Integer> getMax = getMax(map);
        Map.Entry<Character, Integer> getMin = getMin(map);
        System.out.printf("Чаще всего встречается буква: %c количество раз: %d\n", getMax.getKey(), getMax.getValue());
        System.out.printf("Реже всего встречается буква: %c количество раз: %d\n", getMin.getKey(), getMin.getValue());


    }

    private static Map.Entry<Character, Integer> getMax(Map<Character, Integer> map) {
        int max = -1;
        Map.Entry<Character, Integer> resultEntry = null;
        for (Map.Entry<Character, Integer> currentEntry : map.entrySet()) {
            if (currentEntry.getValue() > max) {
                resultEntry = currentEntry;
                max = currentEntry.getValue();
            }
        }
        return resultEntry;
    }

    private static Map.Entry<Character, Integer> getMin(Map<Character, Integer> map) {
        int min = Integer.MAX_VALUE;
        Map.Entry<Character, Integer> resultEntry = null;
        for (Map.Entry<Character, Integer> currentEntry : map.entrySet()) {
            if (currentEntry.getValue() < min) {
                resultEntry = currentEntry;
                min = currentEntry.getValue();
            }
        }
        return resultEntry;
    }


}