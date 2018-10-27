package ru.unn.agile.stringcalculator.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void canReturnZeroForEmptyString() {
        int sum = StringCalculator.Add("");

        assertEquals(0 ,sum);
    }

    @Test
    public void canAddSingleNumber() {
        int sum = StringCalculator.Add("1");

        assertEquals(1 ,sum);
    }

    @Test
    public void canAddTwoNumbersWithDefaultDelimiter() {
        int sum = StringCalculator.Add("1,2");

        assertEquals(3, sum);
    }
    @Test
    public void canGetEmptyNumbersListFromEmptyString() {
        List<String> numbersList = StringCalculator.getNumbersArrayFromString("");

        assertTrue(numbersList.isEmpty());
    }

    @Test
    public void canGetSingleNumberListFromSingleElementString() {
        List<String> expectedSingleNumberList = new ArrayList<>();
        expectedSingleNumberList.add("1");

        List<String> numbersList = StringCalculator.getNumbersArrayFromString("1");

        assertEquals(expectedSingleNumberList, numbersList);
    }

    @Test
    public void canGetTwoNumbersListFromTwoElementsString() {
        List<String> expectedSingleNumberList = new ArrayList<>();
        expectedSingleNumberList.add("1");
        expectedSingleNumberList.add("2");

        List<String> numbersList = StringCalculator.getNumbersArrayFromString("1,2");

        assertEquals(expectedSingleNumberList, numbersList);
    }

}