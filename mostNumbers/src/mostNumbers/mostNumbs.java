package mostNumbers;
import java.util.HashMap;
import java.util.Map;
public class mostNumbs {
	public static Map<Integer, Integer> countOccurences (int[] arr) {
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++) {
        	
            int key = arr[i];
            if (numbers.containsKey(key)) {
                int value = numbers.get(key);
                numbers.put(key, value + 1);
            } else {
                numbers.put(key, 1);
            }
            
        }

        return numbers;
    }

    public static void main(String[] args) {

        int[] array = {2,3,6,5,4,9,6,1,2,6,5,7,9};
        
        System.out.println(countOccurences(array));
        
    }
}