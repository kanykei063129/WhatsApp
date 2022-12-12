package service.impl;

import classes.Passport;
import enums.Country;
import enums.Gender;
import service.PersonService;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    List<Passport> passports = new LinkedList<>();

    public String cratePerson(Passport passport){
        passports.add(passport);
        return "SUCCESSFULLY!!!";
    };

    @Override
    public List<Passport> getAllPassport() {
        return this.passports;
    }

    @Override
    public List<Passport> FirstNamePassport(String FirstName, List<Passport> passports) {
        System.out.println("Write the first name:");
        String name = new Scanner(System.in).next();
        for (Passport passport : passports) {
            if (passport.getFirstName().equals(name)) {
                System.out.println(passport);
            }
        }
        return null;
    }



    @Override
    public List<Country> getAllCity(List<Country> countries) {
        return countries;
    }

    @Override
    public boolean CreatePassport() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the Id:");
        int Id = scanner.nextInt();
        System.out.print("Write name: ");
        String name = scanner.next();
        System.out.print("Write Last name: ");
        String lastName = scanner.next();
        System.out.print("Write Birthday  (yyyy, mm, dd): ");
        LocalDate Birthday = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.print("Write country: ");
        Country country = Country.valueOf(scanner.next());
        System.out.print("Write gender: ");
        Gender gender = Gender.valueOf(scanner.next());
        Passport passport = new Passport(Id, name, lastName, Birthday, country, gender);
        passports.add(passport);
        System.out.println("The passport is ready!!!");
        System.out.println(passport);

        return false;
    }
}



