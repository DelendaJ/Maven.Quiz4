package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        char ch[] = string.toCharArray();
        char middle = ch[ch.length / 2];

        return middle;

    }

    public static String capitalizeMiddleCharacter(String str) {
        char[] arr = str.toCharArray();
        arr[arr.length / 2] = Character.toUpperCase(arr[arr.length / 2]);
        return new String(arr);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] arr = str.toCharArray();
        arr[arr.length / 2] = Character.toLowerCase(arr[arr.length / 2]);
        return new String(arr);
    }

    public static Boolean isIsogram(String str) {
        String[] anArray = str.split("");
        Set<String> aSet = new HashSet<String>(Arrays.asList(anArray));

        if (str.length() == aSet.size()) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            } else {
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        return str.replaceAll("(\\w)\\1+", "");
    }

    public static String invertCasing(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            } else if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        return new String(arr);
    }

}