package io.zipcoder.interfaces;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(0L, "Leuth"));
        this.add(new Student(1L, "Jieuth"));
        this.add(new Student(2L, "Tameuth"));
        this.add(new Student(3L, "Loceuth"));
        this.add(new Student(4L, "Nateuth"));
        this.add(new Student(5L, "Teveuth"));
        this.add(new Student(6L, "Ceseuth"));
        this.add(new Student(7L, "Christeuth"));
        this.add(new Student(8L, "Gowreuth"));
        this.add(new Student(9L, "Imeuth"));
        this.add(new Student(10L, "Joseuth"));
        this.add(new Student(11L, "Mikeuth"));
        this.add(new Student(12L, "Correuth"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
