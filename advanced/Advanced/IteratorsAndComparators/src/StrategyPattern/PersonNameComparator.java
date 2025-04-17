package StrategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {


    @Override
    public int compare(Person firstPerson, Person secondPerson) {

        // 1. начин - Integer
//        Integer firstNameLength = firstPerson.getName().length();
//        Integer secondNameLength = secondPerson.getName().length();
//
//        int resultInteger = firstNameLength.compareTo(secondNameLength);


        // 2. начин - int
        int firstNameLengthInt = firstPerson.getName().length();
        int secondNameLengthInt = secondPerson.getName().length();

        int resultInt = Integer.compare(firstNameLengthInt, secondNameLengthInt);

        if (resultInt == 0) {

            char firstPersonLetter = firstPerson.getName().toUpperCase().charAt(0);
            char secondPersonLetter = secondPerson.getName().toUpperCase().charAt(0);

            resultInt = Character.compare(firstPersonLetter, secondPersonLetter);
        }

        return resultInt;
    }
}
