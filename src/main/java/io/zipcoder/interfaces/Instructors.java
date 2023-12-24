package io.zipcoder.interfaces;

public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        this.add(new Instructor(0L, "Sleuth"));
        this.add(new Instructor(1L, "Kreuth"));
        this.add(new Instructor(2L, "Razeuth"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
