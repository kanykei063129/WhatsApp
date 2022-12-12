package classes;

import enums.Country;
import enums.Gender;

import java.time.LocalDate;

public class Person extends Passport{
    public Person(int id, String lastName, String firstName, LocalDate birthday, Country country, Gender gender) {
        super(id, lastName, firstName, birthday, country, gender);
    }
}
