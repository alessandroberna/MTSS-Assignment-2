////////////////////////////////////////////////////////////////////
// [Alessandro] [Bernardello] [2077674]
// [Edgar] [Djossa] [2089654]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        final int[] decimal = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        final String[] letters = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
            String roman = "";
            if (number < 1 || number > 3999) {
                throw new IllegalArgumentException("Invalid roman number value!");
        }
            while (number > 0) {
                    int maxFound = 0;
                    for (int i=0; i < decimal.length; i++) {
                        if (number >= decimal[i]) {
                            maxFound = i;
                    }
            }
                roman += letters[maxFound];
                number -= decimal[maxFound];
        }
            return roman;       
    }
}