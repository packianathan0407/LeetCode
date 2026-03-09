import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Map to store the values of Roman symbols
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentVal = romanValues.get(s.charAt(i));

           
            if (i < n - 1 && currentVal < romanValues.get(s.charAt(i + 1))) {
               
                total -= currentVal;
            } else {
                
                total += currentVal;
            }
        }

        return total;
    }
}