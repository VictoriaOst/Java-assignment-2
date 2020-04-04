package com.company;

import java.util.List;
import java.util.Objects;

public final class Person {
    private final long id;
    private final String name;
    private final String secondName;
    private final int age;
    private final List<Person> family;

    public Person(long id, String name, String secondName, int age , List<Person> family) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.family = family;
    }


    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }


    public int getAge() {
        return age;
    }


    public List<Person> getFamily() {
        return family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId()) &&
                Objects.equals(getAge(), person.getAge()) &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSecondName(), person.getSecondName()) &&
                Objects.equals(getFamily(), person.getFamily());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSecondName(), getAge(), getFamily());
    }
}
