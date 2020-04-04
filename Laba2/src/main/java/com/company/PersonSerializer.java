package com.company;

import com.google.gson.Gson;


public class PersonSerializer {

    public static String toJson(Person person) {
        Gson gson = new Gson();
        return gson.toJson(person);
    }

    public static Person fromJson(String personInJson) {
        Gson gson = new Gson();
        return gson.fromJson(personInJson, Person.class);
    }
}
