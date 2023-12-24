package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    Students students = Students.getInstance();

    @Test
    public void testStudents() {
        Assert.assertEquals(13, students.count());
        Assert.assertEquals("Leuth", students.findById(0L).getName());
        Assert.assertEquals("Jieuth", students.findById(1L).getName());
        Assert.assertEquals("Tameuth", students.findById(2L).getName());
        Assert.assertEquals("Loceuth", students.findById(3L).getName());
        Assert.assertEquals("Nateuth", students.findById(4L).getName());
        Assert.assertEquals("Teveuth", students.findById(5L).getName());
        Assert.assertEquals("Ceseuth", students.findById(6L).getName());
        Assert.assertEquals("Christeuth", students.findById(7L).getName());
        Assert.assertEquals("Gowreuth", students.findById(8L).getName());
        Assert.assertEquals("Imeuth", students.findById(9L).getName());
        Assert.assertEquals("Joseuth", students.findById(10L).getName());
        Assert.assertEquals("Mikeuth", students.findById(11L).getName());
        Assert.assertEquals("Correuth", students.findById(12L).getName());
    }
}
