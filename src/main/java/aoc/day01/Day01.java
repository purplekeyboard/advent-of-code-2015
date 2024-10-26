package aoc.day01;

import aoc.Day;

import java.util.List;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {
        Lift lift = new Lift();
        lift.ride(input, false);

        return String.valueOf(lift.getCurrentFloor());
    }

    @Override
    public String part2(List<String> input) {
        Lift lift = new Lift();
        lift.ride(input, true);

        return String.valueOf(lift.getButtonPresses());
    }

}
