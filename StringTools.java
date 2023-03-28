public class StringTools {

    private StringTools(){
        
    }

    // Generate a random number in specified range
    /**
     *returns a pseudorandom number in the given range
     *@param max the maximum value of the number (minimum is 0 by default)
     *@return a pseudorandom number with a max of max (exclusive)
     */
    public static int getRandom(int max) {
        return getRandom(0, max);
    }
    /**
     *returns a pseudorandom number in the given range
     *@param min the minimum value of the number
     *@param max the maximum value of the number
     *@return a pseudorandom number with a max of max (exclusive)
     */
    public static int getRandom(int min, int max) {
        return (int)(Math.random() * max) - min;
    }


    /**
     * Get string suffix for provided case
     * @param plur suffix if decider is > 1
     * @param decider the value to compare by 
     * @return plural case or none
     */
    public static String getCase(String plur, int decider) {
        return getCase("", plur, decider);
    }
    /**
     * Get string suffix for provided case
     * @param sing suffix if decider is < 1
     * @param plur suffix if decider is > 1
     * @param decider the value to compare by 
     * @return plural case or none
     */
    public static String getCase(String sing, String plur, int decider) {
        if (decider > 1) {
            return plur;
        }
        return sing;
    }


    // Add spaces between characters in a given String
    /**
     * add a string between every character of another string
     * @param in string text is inserted into
     * @param toBeInserted text to be inserted into string
     * @return completed string with text added between characters
     */
    public static String insertBetween(String in, String toBeInserted) {
        String formatted = new String();
        for (int i = 0; i < in.length(); i++) {
            formatted = formatted + in.charAt(i) + toBeInserted;
        }
        return formatted;
    }


    /**
     * creates a new string of a specific length populated with a specified character
     * length defaults to 0
     * character defaults to space
     * @return constructed string
     */
    public static String getFilledString() {
        return getFilledString(0);
    }
    /**
     * creates a new string of a specific length populated with a specified character
     * character defaults to space
     * @param filler character to fill string with
     * @return constructed string
     */
    public static String getFilledString(int length) {
        return getFilledString(' ', length);
    }
    /**
     * creates a new string of a specific length populated with a specified character
     * length defaults to 0
     * @param filler character to fill string with
     * @return constructed string
     */
    public static String getFilledString(char filler) {
        return getFilledString(filler, 0);
    }
    /**
     * creates a new string of a specific length populated with a specified character
     * @param filler character to fill string with
     * @param length length of string
     * @return constructed string
     */
    public static String getFilledString(char filler, int length) {
        String filling = new String();
        for (int i = 0; i < length; i++) {
            filling = filling + filler;
        };
        return filling;
    }


    // Replaces a letter in a String. Can extend strings + replace multiple letters
    // at once
    /**
     * replaces a letter at an index in a String, will extend strings if needed and can replace whole strings at once
     * @param str input string
     * @param at index requested character is at
     * @param newChars the new String to replace str's characters with
     * @return the updated String
     */
    public static String replaceLetter(String str, int at, String newChars) {
        // Allow for mutliple characters to be replaced at a time 
        int strLength = str.length();
        String old = str;
        // If the index of the character to replace is invalid
        if (at + 1 > strLength || at < 0) {
           throw java.util.IllegalArgumentException("replaceLetter: Index of string to be replaced was invalid or out of index");
        }
        // If provided Index is of the first character
        if (at == 0) {
            str = newChars + old.substring(newLength);
            // If provided Index is of the last character
        } else if (at + 1 == strLength) {
            str = old.substring(0, at) + newChars;
            // If provided Index is somewhere in the middle
        } else {
            str = old.substring(0, at) + newChars;
            // Only add last part if the added string doesn't increase string length
            if (at + newLength <= strLength) {
                str = str + old.substring(at + newLength);
            };
        };
        return str;
    }
}
