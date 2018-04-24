public class StringManipulator {
    public String trimAndConcat(String word1, String word2) {

        String trim1 = "";
        String trim2 = "";

        for (int i = 0; i < word1.length(); i++) {
            char letter = word1.charAt(i);
            if (letter != ' ') {
                trim1 += letter;
            }
        }
        for (int x = 0; x < word2.length(); x++) {
            char letter2 = word2.charAt(x);
            if (letter2 != ' ') {
                trim2 += letter2;
            }
        }
        return trim1 + trim2;
    }

    public Integer getIndexOrNull(String string1, char letter) {
        // int count = StringUtils.countMatches(string1, letter);
        // if (count > 1) {      removing as I cannot return the index value
        //     return 0;         not the index #
        // } else {
        for (int y = 0; y < string1.length(); y++) {
            char find = string1.charAt(y);
            if (find == letter) {
                return y;
            }
        }
        return null;
        // }
    }

    public Integer getIndexOrNull(String this1, String this2) {
        for (int i = 0; i < this1.length(); i++) {
            char find = this1.charAt(i);
            if (find == this2.charAt(0)) {
                for (int j = 1; j < this2.length(); j++) {
                    if (this1.charAt(i + j) != this2.charAt(j)) {
                        break;
                    }
                }
                return i;
            }
        }
        return null;
    }

    public String concatSubstring(String string1, int start, int end, String string2) {
        String outcome = "";
        for (int i = start; i < end; i++) {
            char letter = string1.charAt(i);
            outcome += letter;
        }
        return outcome + string2;
    }

}
