package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    Instructors instructors = Instructors.getInstance();

    @Test
    public void testStudents() {
        Assert.assertEquals(3, instructors.count());
        Assert.assertEquals("Sleuth", instructors.findById(0L).getName());
        Assert.assertEquals("Kreuth", instructors.findById(1L).getName());
        Assert.assertEquals("Razeuth", instructors.findById(2L).getName());
    }
}
