package aoc.day02;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test {

    @Test
    public void testWrappingPaper1() {
        assertEquals(58, new Present(2, 3, 4).getWrappingPaper());
    }

    @Test
    public void testWrappingPaper2() {
        assertEquals(43, new Present(1, 1, 10).getWrappingPaper());
    }

    @Test
    public void testPart1Example1(){
        // Given
        List<String> input = Collections.singletonList("2x3x4");

        // When
        String result = new Day02().part1(input);

        // Then
        assertEquals("58", result);
    }

    @Test
    public void testPart1Example2(){
        // Given
        List<String> input = Collections.singletonList("1x1x10");

        // When
        String result = new Day02().part1(input);

        // Then
        assertEquals("43", result);
    }

    @Test
    public void testRibbonLength1() {
        assertEquals(34, new Present(2, 3, 4).getRibbonLength());
    }

    @Test
    public void testRibbonLength2() {
        assertEquals(14, new Present(1, 1, 10).getRibbonLength());
    }

    @Test
    public void testPart2Example1(){
        // Given
        List<String> input = Collections.singletonList("2x3x4");

        // When
        String result = new Day02().part2(input);

        // Then
        assertEquals("34", result);
    }

    @Test
    public void testPart2Example2(){
        // Given
        List<String> input = Collections.singletonList("1x1x10");

        // When
        String result = new Day02().part2(input);

        // Then
        assertEquals("14", result);
    }

}
