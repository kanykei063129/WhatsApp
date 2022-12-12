package service.impl;

import classes.Profile;
import classes.WhatsApp;
import enums.Status;
import service.WhatsAppService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatsAppServiceImpl implements WhatsAppService {
    List<WhatsApp> profiles = new ArrayList<>();
    private List<String> message = new ArrayList<>();

    public String crateWhatsapp(WhatsApp whatsApps){
        this.profiles.add(whatsApps);
    }
    @Override
    public List<WhatsApp> getAllWhatsapp() {
        return this.profiles;
    }

    @Override
    public Profile LogintoProfile() {
        System.out.println("Your paswort:");
        Scanner scanner = new Scanner(System.in);
        String pasword = scanner.nextLine();
        for (WhatsApp profile : profiles) {
            if (profile.getPasword().equals(pasword)) {
                return profile.getProfile();
            }
        }
        return null;
    }

    @Override
    public List<Status> getAllStatus() {
        return null;
    }

    @Override
    public boolean InstallPassport() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Write the Id:");
            long id = scanner.nextLong();
            System.out.println("Write User name:");
            String UserName = scanner.nextLine().trim();
            System.out.println("Passport:");
            String passport = scanner.nextLine();
            System.out.println("Write Phone number:");
            String phoneNumber = scanner.nextLine().toLowerCase();

            List<Profile> contacts = new ArrayList<>();
            List<String> message = new ArrayList<>();

            for (WhatsApp profile : profiles) {
                String userName = null;
                if (profile.getUserName().equals(userName)) ;
                throw new Exception("User name is incorrect!!!");
            }
            Profile profile = null;
            if (profile.getId() == id) {
                throw new Exception("Id is incorrect!!!");
            }
            String pasword = null;
            if (profile.getPasword().equals(pasword)) {
                throw new Exception("Pasword is incorrect!!!");
            }
            if (profile.getPhoneNumber().equals(phoneNumber)) {
                throw new Exception("Phone number is incorrect!!!");
            }
            Profile profile1 = new Profile(id, UserName, pasword, phoneNumber, contacts, message, Status.В_СПОРТЗАЛЕ);
            profiles.add(profile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void ChangeStatus() {

    }

    @Override
    public void AddContact() {

    }

    @Override
    public String SendMessage(String passport, String name, String message, List<Profile> profiles, List<Profile> profiles1) {
        for (Profile profile : profiles) {
            for (Profile profile1 : profiles1) {
                String pasword = null;
                if (profile.getPasword().equals(pasword)) {
                    if (profile1.getUserName().equals(name)) {
                        this.message.add(profile.getUserName() +" : "+ message);

                        profile1.setMessage((ArrayList<String>) this.message);
                        return "MESSAGE SENT!!!";
                    }
                }
            }
        }
        return passport;
    }
}


