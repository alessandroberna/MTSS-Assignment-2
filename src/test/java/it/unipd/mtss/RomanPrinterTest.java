////////////////////////////////////////////////////////////////////
// [Alessandro] [Bernardello] [2077674]
// [Edgar] [Djossa] [2089654]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void testLetterI(){
        String result = RomanPrinter.print(1);
        
        assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n",result);
    }

    @Test
    public void testLetterV(){
        String result = RomanPrinter.print(5);
        
        assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n",result);
    }

    @Test
    public void testNumberEightPrint(){
        String result = RomanPrinter.print(8);
        
        assertEquals(" __      __ _____  _____  _____ \n \\ \\    / /|_   _||_   _||_   _|\n  \\ \\  / /   | |    | |    | |  \n   \\ \\/ /    | |    | |    | |  \n    \\  /    _| |_  _| |_  _| |_ \n     \\/    |_____||_____||_____|\n",result);
    }

    @Test
    public void testLetterX(){
        String result = RomanPrinter.print(10);
        
        assertEquals(" __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n",result);
    }

    @Test
    public void testNumerFourteenPrint(){
        String result = RomanPrinter.print(14);
        
        assertEquals(" __   __ _____  __      __\n \\ \\ / /|_   _| \\ \\    / /\n  \\ V /   | |    \\ \\  / / \n   > <    | |     \\ \\/ /  \n  / . \\  _| |_     \\  /   \n /_/ \\_\\|_____|     \\/    \n",result);
    }

    @Test
    public void testLetterL(){
        String result = RomanPrinter.print(50);
        
        assertEquals("  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n",result);
    }


    @Test
    public void testNumberFortyOnePrint(){
        String result = RomanPrinter.print(41);
        
        assertEquals(" __   __  _       _____ \n \\ \\ / / | |     |_   _|\n  \\ V /  | |       | |  \n   > <   | |       | |  \n  / . \\  | |____  _| |_ \n /_/ \\_\\ |______||_____|\n",result);
    }


    @Test
    public void testNumberFortyNinePrint(){
        String result = RomanPrinter.print(49);
        
        assertEquals(" __   __  _       _____  __   __\n \\ \\ / / | |     |_   _| \\ \\ / /\n  \\ V /  | |       | |    \\ V / \n   > <   | |       | |     > <  \n  / . \\  | |____  _| |_   / . \\ \n /_/ \\_\\ |______||_____| /_/ \\_\\\n",result);
    }


    @Test
    public void testNumberNinetyPrint(){
        String result = RomanPrinter.print(90);
        
        assertEquals(" __   __  _____ \n \\ \\ / / / ____|\n  \\ V / | |     \n   > <  | |     \n  / . \\ | |____ \n /_/ \\_\\ \\_____|\n",result);
    }

    @Test
    public void testNumberOneHundredTwentyThreePrint(){
        String result = RomanPrinter.print(123);
        
        assertEquals("  _____  __   __ __   __ _____  _____  _____ \n / ____| \\ \\ / / \\ \\ / /|_   _||_   _||_   _|\n| |       \\ V /   \\ V /   | |    | |    | |  \n| |        > <     > <    | |    | |    | |  \n| |____   / . \\   / . \\  _| |_  _| |_  _| |_ \n \\_____| /_/ \\_\\ /_/ \\_\\|_____||_____||_____|\n",result);
    }

    @Test
    public void testNumberFourHundredPrint(){
        String result = RomanPrinter.print(400);
        
        assertEquals("  _____  _____  \n / ____||  __ \\ \n| |     | |  | |\n| |     | |  | |\n| |____ | |__| |\n \\_____||_____/ \n",result);
    }

    @Test
    public void testNumberSixHundredNinetyNinePrint(){
        String result = RomanPrinter.print(699);
        
        assertEquals(" _____    _____  __   __  _____  _____  __   __\n|  __ \\  / ____| \\ \\ / / / ____||_   _| \\ \\ / /\n| |  | || |       \\ V / | |       | |    \\ V / \n| |  | || |        > <  | |       | |     > <  \n| |__| || |____   / . \\ | |____  _| |_   / . \\ \n|_____/  \\_____| /_/ \\_\\ \\_____||_____| /_/ \\_\\\n",result);
    }

    @Test
    public void testNumberNineHundredNineteenPrint(){
        String result = RomanPrinter.print(919);
        
        assertEquals("  _____  __  __  __   __ _____  __   __\n / ____||  \\/  | \\ \\ / /|_   _| \\ \\ / /\n| |     | \\  / |  \\ V /   | |    \\ V / \n| |     | |\\/| |   > <    | |     > <  \n| |____ | |  | |  / . \\  _| |_   / . \\ \n \\_____||_|  |_| /_/ \\_\\|_____| /_/ \\_\\\n",result);
    }

    @Test
    public void testNumberNineHundredNinetyNinePrint(){
        String result = RomanPrinter.print(999);
        
        assertEquals("  _____  __  __  __   __  _____  _____  __   __\n / ____||  \\/  | \\ \\ / / / ____||_   _| \\ \\ / /\n| |     | \\  / |  \\ V / | |       | |    \\ V / \n| |     | |\\/| |   > <  | |       | |     > <  \n| |____ | |  | |  / . \\ | |____  _| |_   / . \\ \n \\_____||_|  |_| /_/ \\_\\ \\_____||_____| /_/ \\_\\\n",result);
    }

    @Test
    public void testNumberOneThousandPrint(){
        String result = RomanPrinter.print(1000);
        
        assertEquals(" __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n",result);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbersPrint(){       
        RomanPrinter.print(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumberZeroPrint(){
        RomanPrinter.print(0);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNumberGreaterThanOneThousandPrint(){
        RomanPrinter.print(4001);
    }

    @Test
    public void testInstance() { //necessario per la copertura del codice
        new RomanPrinter();
    }
}