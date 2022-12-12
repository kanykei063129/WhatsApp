package service;

import classes.Profile;
import classes.WhatsApp;
import enums.Status;

import java.util.List;

public interface WhatsAppService {
    String crateWhatsapp(WhatsApp whatsApps);
    List<WhatsApp>getAllWhatsapp();
    Profile LogintoProfile();
    List<Status>getAllStatus();
    boolean InstallPassport();
    void ChangeStatus();
    void AddContact();
    String SendMessage(String passport, String name, String message, List<Profile>profiles, List<Profile> profiles1);

}
