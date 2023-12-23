package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(0L, "Leuth");

        Assert.assertNotNull(person);
    }

    @Test
    public void testSetName(){
        Person person = new Person(0L, "Leuth");
        String expected = "Sleuth";
        person.setName(expected);

        Assert.assertEquals(expected, person.getName());
    }
}
