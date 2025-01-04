package BinarySearchOnAnswer;

import java.util.HashSet;

public class unique_length_3_pallindrome_subsquences {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashSet<Character> uniqueLetters = new HashSet<>();
        
        for (char ch : s.toCharArray()) {
            uniqueLetters.add(ch);
        }
        
        int result = 0;
        
        for (char letter : uniqueLetters) {
            int firstIndex = -1;
            int lastIndex = -1;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == letter) {
                    if (firstIndex == -1) {
                        firstIndex = i;
                    }
                    lastIndex = i;
                }
            }
            
            HashSet<Character> middleChars = new HashSet<>();
            for (int middle = firstIndex + 1; middle < lastIndex; middle++) {
                middleChars.add(s.charAt(middle));
            }
            
            result += middleChars.size();
        }
        
        return result;
    }
}

