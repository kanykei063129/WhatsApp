import classes.Passport;
import classes.Profile;
import enums.Country;
import service.impl.PersonServiceImpl;
import service.impl.WhatsAppServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Passport>passports = new ArrayList<>();
        List<Country>passports1  =new ArrayList<>();
        List<Profile>profiles = new ArrayList<>();

        while (true) {
            PersonServiceImpl personService = new PersonServiceImpl();
            WhatsAppServiceImpl whatsAppService = new WhatsAppServiceImpl();
            System.out.println("""
                    ************ Commands ************ 
                    1 -> Get all passport <-
                    2 -> Get passport by first name <-
                    3 -> Get all whatsapp <-
                    4 -> Go to your profile <-
                    5 -> Get all city <-
                    6 -> Get whatsapp status <-
                    7 -> Create a passport <-
                    8 -> Install whatsapp <-
                   
                    9 -> Send a massage <-
                    """);

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> System.out.println(personService.getAllPassport());
                case 2 -> System.out.println(personService.FirstNamePassport(scanner.nextLine(),personService.getAllPassport()));
                case 3 -> System.out.println(whatsAppService.getAllWhatsapp());
                case 4 -> System.out.println(whatsAppService.LogintoProfile());
                case 5 -> System.out.println(personService.getAllCity(passports1));
                case 6 -> System.out.println(whatsAppService.getAllStatus());
                case 7 -> System.out.println(personService.CreatePassport());
                case 8 -> System.out.println(whatsAppService.InstallPassport());
                case 9 -> System.out.println(whatsAppService.SendMessage(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),profiles,profiles));
            }
        }
    }
}

