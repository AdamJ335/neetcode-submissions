class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        //defining rules for brackets
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) { // found a closed bracket
                if (!brackets.isEmpty() && brackets.peek() == closeToOpen.get(c)) { // found correct open bracket, remove pair
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                brackets.push(c); // open bracket found, add and move on
            }
        }
        return brackets.isEmpty();
        
    }
}
