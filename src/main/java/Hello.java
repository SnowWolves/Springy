package main.java;

import org.joda.time.LocalTime;

/**
 * Created by asapenuk on 9/28/2016.
 */
public class Hello
{
    public static void main(String[] args)
    {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        main.java.Greeter greeter = new main.java.Greeter();
        System.out.println(greeter.sayHello());
    }
}
