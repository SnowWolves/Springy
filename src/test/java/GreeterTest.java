package main.java;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Created by asapenuk on 9/28/2016.
 */
public class GreeterTest
{
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello()
    {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
