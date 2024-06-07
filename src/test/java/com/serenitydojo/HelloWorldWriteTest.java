package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriteTest {
    @Test
    public void shouldWriteHellowWorldToTheConsole(){
       HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHellowWorld();
    }
}
