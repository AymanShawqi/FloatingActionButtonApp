package com.android.testapp;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int id;
    private String name;


    private Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static List<Person> getPersonsList(){
         List<Person> personsList=new ArrayList<>();
            personsList.add(new Person(1,"Ali"));
            personsList.add(new Person(2,"fhh"));
            personsList.add(new Person(3,"gh"));
            personsList.add(new Person(4,"fge"));
            personsList.add(new Person(5,"tuu"));
            personsList.add(new Person(6,"frh"));
            personsList.add(new Person(7,"wdfwf"));
            personsList.add(new Person(8,"bnv"));
            personsList.add(new Person(9,"rgth"));
            personsList.add(new Person(10,"wgerg"));
            personsList.add(new Person(11,"ghh"));
            personsList.add(new Person(12,"fgge"));
            personsList.add(new Person(13,"hrg"));
            personsList.add(new Person(14,"ghh"));
            personsList.add(new Person(15,"ttrh"));
            personsList.add(new Person(16,"hrth"));
            personsList.add(new Person(17,"fgge"));
            personsList.add(new Person(18,"geg"));
            personsList.add(new Person(19,"ghjj"));
            personsList.add(new Person(20,"hrh"));
            personsList.add(new Person(21,"frhr"));
            personsList.add(new Person(22,"greg"));
            personsList.add(new Person(23,"dfrg"));
            personsList.add(new Person(24,"gerg"));
            personsList.add(new Person(25,"jhui"));
        return personsList;
    }
}
