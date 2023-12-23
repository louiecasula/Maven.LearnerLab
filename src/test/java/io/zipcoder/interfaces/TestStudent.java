package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    Student student = new Student(0L, "Leuth");

    @Test
    public void testImplementation(){
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Double expected = 8.0;
        student.learn(expected);

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
}
