package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StrategyTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                        .append("------")
                        .append("|    |")
                        .append("|    |")
                        .append("-----")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
        System.setOut(stout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream (out));
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append("   O   ")
                .append("  OOO  ")
                .append(" OOOOO ")
                .append("OOOOOOO")
                .append(System.lineSeparator())
                .toString()
        )
        );
        System.setOut(stout);
    }
}
