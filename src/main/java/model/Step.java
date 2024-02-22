package model;

import java.util.Arrays;

public enum Step {
    EXIST(true, "-----"),
    NONE(false, "     ");

    private final boolean doesExist;
    private final String output;

    Step(boolean doesExist, String output) {
        this.doesExist = doesExist;
        this.output = output;
    }

    public static Step findByExistence(boolean doesExist) {
        return Arrays.stream(values())
                .filter(value -> value.doesExist == doesExist)
                .findAny()
                .orElse(null);
    }

    public String getOutput() {
        return output;
    }
}
