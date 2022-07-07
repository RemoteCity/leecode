package com.whk;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void shouldAnswerWithTru() {
        List<String> stringList = new LinkedList<>();
        stringList.stream().forEach(e-> System.out.println(e));
    }
}
