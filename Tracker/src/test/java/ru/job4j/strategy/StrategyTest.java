package ru.job4j.strategy;

import org.hamcrest.core.StringContains;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StrategyTest {
    private final PrintStream stout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println(" execute before method. ");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOUtput() {
        System.setOut(this.stout);
        System.out.println(" execute after method. ");
    }

    @Test
    public void whenTriangle() {
        new Paint().draw(new Triangle());
        assertThat(this.out.toString(), is(new StringBuilder()
                .append("     1     ")
                .append(System.lineSeparator())
                .append("    011     ")
                .append(System.lineSeparator())
                .append("   101010   ")
                .append(System.lineSeparator())
                .append(" 010101010  ")
                .append(System.lineSeparator())
                .append("000101010101")
                .append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
    }

    @Test
    public void whenSquare() {
        new Paint().draw(new Square());
        assertThat(this.out.toString(), is(new StringBuilder()
                        .append("10010101010")
                        .append(System.lineSeparator())
                        .append("0         1")
                        .append(System.lineSeparator())
                        .append("0         0")
                        .append(System.lineSeparator())
                        .append("1         0")
                        .append(System.lineSeparator())
                        .append("01010101010")
                        .append(System.lineSeparator())
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }
}
