package aoc.day01;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test {

    @Test
    public void testInvalidCharacter() {
        assertThrows(IllegalArgumentException.class, () -> Button.fromChar('X'));
    }

    @Test
    public void testPart1Example1(){
        // Given
        List<String> input = Collections.singletonList("(())");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("0", result);
    }

    @Test
    public void testPart1Example2(){
        // Given
        List<String> input = Collections.singletonList("()()");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("0", result);
    }

    @Test
    public void testPart1Example3(){
        // Given
        List<String> input = Collections.singletonList("(((");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("3", result);
    }

    @Test
    public void testPart1Example4(){
        // Given
        List<String> input = Collections.singletonList("(()(()(");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("3", result);
    }

    @Test
    public void testPart1Example5(){
        // Given
        List<String> input = Collections.singletonList("))(((((");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("3", result);
    }

    @Test
    public void testPart1Example6(){
        // Given
        List<String> input = Collections.singletonList("())");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("-1", result);
    }

    @Test
    public void testPart1Example7(){
        // Given
        List<String> input = Collections.singletonList("))(");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("-1", result);
    }

    @Test
    public void testPart1Example8(){
        // Given
        List<String> input = Collections.singletonList(")))");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("-3", result);
    }

    @Test
    public void testPart1Example9(){
        // Given
        List<String> input = Collections.singletonList(")())())");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("-3", result);
    }

    @Test
    public void testPart2Example1(){
        // Given
        List<String> input = Collections.singletonList(")");

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals("1", result);
    }

    @Test
    public void testPart2Example2(){
        // Given
        List<String> input = Collections.singletonList("()())");

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals("5", result);
    }
}
