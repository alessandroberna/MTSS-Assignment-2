////////////////////////////////////////////////////////////////////
// [Alessandro] [Bernardello] [2077674]
// [Edgar] [Djossa] [2089654]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print (int num){
        try {
            return printAsciiArt(IntegerToRoman.convert(num));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    
    static final String[] letterI = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };

    static final String[] letterV = {
        " __      __",
        " \\ \\    / /",
        "  \\ \\  / / ",
        "   \\ \\/ /  ",
        "    \\  /   ",
        "     \\/    "
    };

    static final String[] letterX = {
        " __   __",
        " \\ \\ / /",
        "  \\ V / ",
        "   > <  ",
        "  / . \\ ",
        " /_/ \\_\\"
    };

    static final String[] letterL = {
        "  _      ",
        " | |     ",
        " | |     ",
        " | |     ",
        " | |____ ",
        " |______|"
    };

    static final String[] letterC = {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    };

    static final String[] letterD = {
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    };

    static final String[] letterM = {
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    };

    private static String printAsciiArt(String romanNumber){
        StringBuilder sb = new StringBuilder();
            
        for (int i = 0; i < 6; i++) {
            for (char ch : romanNumber.toCharArray()) {    
                switch (ch) {
                    case 'I':
                        sb.append(letterI[i]);
                        break;
                    case 'V':
                        sb.append(letterV[i]);
                        break;
                    case 'X':
                        sb.append(letterX[i]);
                        break;
                    case 'L':
                        sb.append(letterL[i]);
                        break;
                    case 'C':
                        sb.append(letterC[i]);
                        break;
                    case 'D':
                        sb.append(letterD[i]);
                        break;
                    case 'M':
                        sb.append(letterM[i]);
                        break;
                }
                //sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }    
}