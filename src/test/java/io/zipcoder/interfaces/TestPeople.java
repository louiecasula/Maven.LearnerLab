package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    People people = new People();

    @Test
    public void testAdd(){
        Person person = new Person(0L, "Leuth");
        people.add(person);

        Assert.assertEquals(1, people.count());
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove(){
        Person person = new Person(0L, "Leuth");
        people.add(person);
        people.remove(0L);

        Assert.assertEquals(0, people.count());
        Assert.assertFalse(people.contains(person));
    }

    @Test
    public void testFindById(){
        Person expected = new Person(0L, "Leuth");
        people.add(expected);

        Assert.assertEquals(expected, people.findById(0L));
    }
}
