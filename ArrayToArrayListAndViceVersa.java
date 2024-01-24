// Shubh Agarwal
// AIML B2 
// 22070126108 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListAndViceVersa {

    public static void main(String[] args) {
        // Example: Convert Array to ArrayList
        String[] array = {"Java", "Python", "C++", "JavaScript", "Ruby"};
        List<String> arrayListFromArr = convertArrayToArrayList(array);

        System.out.println("Array converted to ArrayList: " + arrayListFromArr);

        // Example: Convert ArrayList to Array
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] arrayFromList = convertArrayListToArray(integerList, Integer.class);

        System.out.println("ArrayList converted to Array: " + Arrays.toString(arrayFromList));
    }

    // Method to convert Array to ArrayList
    public static <T> List<T> convertArrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    // Method to convert ArrayList to Array
    public static <T> T[] convertArrayListToArray(List<T> list, Class<T> clazz) {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, list.size());
        return list.toArray(array);
    }
}
