package aoc.day01;

public enum Button {
    UP('('),
    DOWN(')');

    private final char buttonChar;

    Button(char buttonChar) {
        this.buttonChar = buttonChar;
    }

    public static Button fromChar(char c) {
        for (Button button : values()) {
            if (button.buttonChar == c) {
                return button;
            }
        }
        throw new IllegalArgumentException("Invalid button character: " + c);
    }
}
