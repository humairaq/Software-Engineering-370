package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }
    //tests if NullPointerException is thrown when string is null
    @Test(expected = NullPointerException.class)
    public void testCountNumbers2() {
        mycustomstring.setString(null);
        mycustomstring.countNumbers();

    }
    //tests when there are negative numbers
    @Test
    public void testCountNumbers3() {

        mycustomstring.setString("-5oftware -3ngineering");
        assertEquals(2, mycustomstring.countNumbers());
    }
    //test when there is are periods between numbers
    @Test
    public void testCountNumbers4() {
        mycustomstring.setString("1.2.3.4.5");
        assertEquals(5, mycustomstring.countNumbers());
    }
    //test when there are only numbers
    @Test
    public void testCountNumbers5() {
        mycustomstring.setString("1 2 3 4 5 ");
        assertEquals(5, mycustomstring.countNumbers());
    }
    //test with same number multiple times
    @Test
    public void testCountNumbers6() {
        mycustomstring.setString("11a 11b 11c");
        assertEquals(3, mycustomstring.countNumbers());
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
    //tests if IllegalArgumentException is thrown when n is less than 0
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-3, true);
    }
    //tests is NullPointerException is thrown when string is null and n is greater than zero
    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true);
    }
    //test if IllegalArgumentException is thrown when n is 0 and start from beginning
    @Test (expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
    }
    //test when n = 2 and string of one character, method returns empty string
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        mycustomstring.setString("a");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));

    }
    //test when n = 3 and startfromend = true, 3rd, 6th, and so on is returned
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        mycustomstring.setString("1-1-1-1-1-1-1-1");
        assertEquals("1-1-1", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
    //test with only numbers and symbols
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        mycustomstring.setString("1!2@3#4$5%6^7&8*9(0)");
        assertEquals("!@#$%^&*()", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));

    }
    //test when starting from end if every 5th character is returned
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        mycustomstring.setString("50000500005000050000");
        assertEquals("5555", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, true));
    }
    //test every 4th character starting from the beginning
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        mycustomstring.setString("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
        assertEquals(",,,,0,14,18,", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));

    }
    //testing palindrome starting from end
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        mycustomstring.setString("racecar");
        assertEquals("aea", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));

    }
    //testing palindrome starting from beginning
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        mycustomstring.setString("racecar");
        assertEquals("aea", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }
    //test when n = 2 and startfromend = false, returns 2nd, 4th, 6th, and 8th character
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        mycustomstring.setString("123456789");
        assertEquals("2468", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }
    //test when n = 1 and starting from the end
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        mycustomstring.setString("987654321");
        assertEquals("987654321", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));

    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }
    //test that IllegalArgumentException is thrown when startPosition" > "endPosition
    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("123456789");
        mycustomstring.convertDigitsToNamesInSubstring(9, 1);

    }
    //test that MyIndexOutOfBoundsException is thrown when startPosition < endPosition and start position is a negative
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(-1, 23);
    }
    //test that NullPointerException is thrown when string is null and startPosition/endPosition are greater than 0
    @Test(expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
    }

    //test when startPosition and endPosition are equal
    @Test
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.setString("One2Three");
        mycustomstring.convertDigitsToNamesInSubstring(4, 4);
        assertEquals("OneTwoThree", mycustomstring.getString());

    }
    //testing when there are spaces in between numbers
    @Test
    public void testConvertDigitsToNamesInSubstring6() {
        mycustomstring.setString("1 2 3");
        mycustomstring.convertDigitsToNamesInSubstring(1, 5);
        assertEquals("One Two Three", mycustomstring.getString());

    }
    //test MyIndexOutOfBoundsException when endPosition is greater than length of string
    @Test (expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring7() {
        mycustomstring.setString("One");
        mycustomstring.convertDigitsToNamesInSubstring(1, 5);


    }
    //test when there are no digits
    @Test
    public void testConvertDigitsToNamesInSubstring8() {
        mycustomstring.setString("no digits");
        mycustomstring.convertDigitsToNamesInSubstring(1, 9);
        assertEquals("no digits", mycustomstring.getString());

    }
}

