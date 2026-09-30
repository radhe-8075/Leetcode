class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int depth = 0;
        
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                // Distribute opening brackets alternately to keep depths balanced
                res[i] = depth % 2;
                depth++;
            } else {
                depth--;
                // Closing bracket matches the corresponding opening bracket's assignment
                res[i] = depth % 2;
            }
        }
        
        return res;
    }
}