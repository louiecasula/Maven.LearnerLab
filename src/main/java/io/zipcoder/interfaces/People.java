package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {

    private List<Person> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(Long id) {
        for (Person person: this.personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person) {
        return this.personList.contains(person);
    }

    public void remove(Person person) {
        this.personList.remove(person);
    }

    public void remove(Long id) {
        this.personList.remove(this.findById(id));
    }

    public void removeAll() {
        this.personList.clear();
    }

    public int count() {
        return this.personList.size();
    }

    public Object[] toArray() {
        return this.personList.toArray();
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator<Person> {

        int cursor;
        int lastReturned = -1;

        @Override
        public boolean hasNext() {
            return cursor != count();
        }

        @Override
        public Person next() {
            int current = cursor;

            Person[] people = (Person[]) toArray();

            cursor = current + 1;
            lastReturned = current;
            return people[lastReturned];
        }
    }
}
