////////////////////////////////////////////////////////////////////
// [Alessandro] [Bernardello] [2077674]
// [Edgar] [Djossa] [2089654]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert1() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvert4() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvert5() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvert6() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvert9() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert10() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvert11() {
        assertEquals("XI", IntegerToRoman.convert(11));
    }

    @Test
    public void testConvert14() {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void testConvert15() {
        assertEquals("XV", IntegerToRoman.convert(15));
    }

    @Test
    public void testConvert19() {
        assertEquals("XIX", IntegerToRoman.convert(19));
    }

    @Test
    public void testConvert20() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvert50() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvert100() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvert500() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvert1000() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void testConvert999() {
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert0() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNegativeNumber() {
        IntegerToRoman.convert(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertInvalidNumber() {
        IntegerToRoman.convert(4000);
    }

    @Test
    public void testConvert40() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void testConvert900() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void testConvert39() {
        assertEquals("XXXIX", IntegerToRoman.convert(39));
    }

    @Test
    public void testConvert499() {
        assertEquals("CDXCIX", IntegerToRoman.convert(499));
    }

    @Test
    public void testConvert3() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvert8() {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConvert12() {
        assertEquals("XII", IntegerToRoman.convert(12));
    }

    @Test
    public void testInstancing() { //necessario per la copertura del codice
        new IntegerToRoman();
    }
}