import java.util.HashMap;
import java.util.Set;
import java.util.Stack;
import java.util.HashSet;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> ab = new HashMap<>();
        ab.put(')', '(');
        ab.put(']', '[');
        ab.put('}', '{');

        Set<Character> opens = new HashSet<>(Set.of('(', '[', '{'));
        Set<Character> closes = new HashSet<>(Set.of(')', ']', '}'));

        Stack<Character> exp = new Stack<>();

        for (char x : s.toCharArray()) {
            if (opens.contains(x)) {
                exp.push(x);
            }
            if (closes.contains(x)) {
                if (!exp.isEmpty() && exp.peek().equals(ab.get(x))) {
                    exp.pop();
                } else {
                    return false;
                }
            }
        }
        return exp.isEmpty();
    }
}
