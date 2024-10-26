package aoc.day02;

import java.util.Arrays;
import java.util.Collections;

public class Present {
    private final int side1Area;
    private final int side2Area;
    private final int side3Area;
    private final int side1Perimeter;
    private final int side2Perimeter;
    private final int side3Perimeter;
    private final int bowLength;

    public Present(int length, int width, int height) {
        this.side1Area = length * width;
        this.side2Area = width * height;
        this.side3Area = height * length;

        this.side1Perimeter = length + width;
        this.side2Perimeter = width + height;
        this.side3Perimeter = height + length;

        this.bowLength = length * width * height;
    }

    public int getWrappingPaper() {
        return getSurfaceArea() + getSmallestArea();
    }

    public int getRibbonLength() {
        return this.bowLength + (2 * getSmallestPerimeter());
    }

    private int getSurfaceArea() {
        return 2 * (this.side1Area + this.side2Area + this.side3Area);
    }

    private int getSmallestArea() {
        return Collections.min(Arrays.asList(this.side1Area, this.side2Area, this.side3Area));
    }

    private int getSmallestPerimeter() {
        return Collections.min(Arrays.asList(this.side1Perimeter, this.side2Perimeter, this.side3Perimeter));
    }
}
