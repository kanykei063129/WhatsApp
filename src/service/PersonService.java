package service;

import classes.Passport;
import enums.Country;

import java.util.List;

public interface PersonService {
    List<Passport>getAllPassport();
    List<Passport>FirstNamePassport(String FirstName,List<Passport>passports);
    List<Country>getAllCity(List<Country>countries);
    boolean CreatePassport();
}
