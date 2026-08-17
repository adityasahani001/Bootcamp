// 2114. Maximum Number of Words Found in Sentences

class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            int spaces = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spaces++;
                }
            }
            maxWords = Math.max(maxWords, spaces + 1);
        }
        
        return maxWords;
    }
}
