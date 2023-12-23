package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    Teacher instructor = new Instructor(0L, "Sleuth");

    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student(0L, "Leuth");

        Double expected = 8.0;
        instructor.teach(student, expected);

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        Learner[] learners = new Learner[2];
        Student student = new Student(0L, "Leuth");
        learners[0] = student;
        learners[1] = new Student(0L, "Teuth");

        Double hours = 8.0;
        instructor.lecture(learners, hours);
        Double expected = hours/learners.length;

        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
}
