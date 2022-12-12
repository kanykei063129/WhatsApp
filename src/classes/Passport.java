package classes;


import enums.Country;
import enums.Gender;

import java.time.LocalDate;

public class Passport {
    private int Id;
    private String LastName;
    private String FirstName;
    private LocalDate Birthday;
    private Country country;
    private Gender gender;

    public Passport(int id, String lastName, String firstName, LocalDate birthday, Country country, Gender gender) {
        Id = id;
        LastName = lastName;
        FirstName = firstName;
        Birthday = birthday;
        this.country = country;
        this.gender = gender;
    }

    public Passport() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "Id=" + Id +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Birthday=" + Birthday +
                ", country=" + country +
                ", gender=" + gender +
                '}';
    }

}

