/*
------------------------------------------------------------
LeetCode 408. Valid Word Abbreviation
Difficulty: Easy
------------------------------------------------------------

Problem Statement

A string can be abbreviated by replacing any number of
non-adjacent, non-empty substrings with their lengths.

Example:
word = "internationalization"
abbr = "i12iz4n"

Output:
true

Approach
1. Use two pointers.
2. Traverse both strings.
3. Match letters directly.
4. Parse complete numbers and skip characters.
5. Reject abbreviations with leading zero.

Time Complexity: O(n)
Space Complexity: O(1)
------------------------------------------------------------
*/

class Solution {

    public boolean validWordAbbreviation(String word, String abbr) {

        int i = 0;
        int j = 0;

        while (i < word.length() && j < abbr.length()) {

            if (Character.isLetter(abbr.charAt(j))) {

                if (word.charAt(i) != abbr.charAt(j))
                    return false;

                i++;
                j++;

            } else {

                if (abbr.charAt(j) == '0')
                    return false;

                int num = 0;

                while (j < abbr.length() &&
                       Character.isDigit(abbr.charAt(j))) {

                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                i += num;
            }
        }

        return i == word.length() && j == abbr.length();
    }
}
