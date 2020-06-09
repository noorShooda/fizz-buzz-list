package fizz.buzz.list.test;

import fizz.buzz.list.helpers.Helpers;

import static org.junit.jupiter.api.Assertions.*;

class HelpersTest {

    Helpers helperTest;

    {
        helperTest = new Helpers();
    }

    @org.junit.jupiter.api.Test
    void divisibleByThree() {
        System.out.println("Inside DivisibleByThreeTest()");
        boolean output = helperTest.divisibleByThree(6);
        assertEquals(true, output);
    }

    @org.junit.jupiter.api.Test
    void divisibleByFive() {
        System.out.println("Inside DivisibleByFiveTest()");
        boolean output = helperTest.divisibleByFive(10);
        assertEquals(true, output);
    }

    @org.junit.jupiter.api.Test
    void divisibleByFifteen() {
        System.out.println("Inside DivisibleByFifteenTest()");
        boolean output = helperTest.divisibleByFifteen(15);
        assertEquals(true, output);
    }

    @org.junit.jupiter.api.Test
    void convertFizzBuzz() {
        System.out.println("Inside ConvertFizzBuzzTest()");
        String output = helperTest.convertFizzBuzz(6);
        assertEquals("Fizz 6", output);
    }
}