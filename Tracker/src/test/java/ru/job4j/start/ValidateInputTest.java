package ru.job4j.start;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import ru.job4j.models.StubInput;
import ru.job4j.models.ValidateInput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final PrintStream stout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before
    public void loadOutput (){
        System.out.println(" methods before ");
        System.setOut(new PrintStream(this.out));

    }
    @After
    public void backOutput (){
        System.setOut(this.stout);
        System.out.println(" methods after ");
    }

@Test
    public void whenInvalidInput (){

    ValidateInput input = new ValidateInput(new StubInput(new String[]{"invalid", "1"}));
    input.askInt("Enter", 1);
    assertThat(this.out.toString(), is (new StringJoiner(System.lineSeparator(), " ", System.lineSeparator())
    .add("Please enter validate data again ")
    .toString()
    )
    );
}
}
