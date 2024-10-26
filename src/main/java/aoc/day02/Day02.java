package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 implements Day {

    @Override
    public String part1(List<String> input) {
        int totalWrappingPaperRequired = 0;
        for (String presentDimensions : input) {
            String [] dimensions = presentDimensions.split("x");
            totalWrappingPaperRequired += new Present(Integer.parseInt(dimensions[0]),
                                                      Integer.parseInt(dimensions[1]),
                                                      Integer.parseInt(dimensions[2]))
                                                      .getWrappingPaper();
        }

        return String.valueOf(totalWrappingPaperRequired);
    }

    @Override
    public String part2(List<String> input) {
        int totalRibbonRequired = 0;
        for (String presentDimensions : input) {
            String [] dimensions = presentDimensions.split("x");
            totalRibbonRequired += new Present(Integer.parseInt(dimensions[0]),
                    Integer.parseInt(dimensions[1]),
                    Integer.parseInt(dimensions[2]))
                    .getRibbonLength();
        }

        return String.valueOf(totalRibbonRequired);
    }

}
