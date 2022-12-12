package classes;

import enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private long id;
    private String phoneNumber;
    private String userName;
    private String pasword;
    private Status status;
    private Profile profile;
    private List<Profile> contact;
    private List<String> message = new ArrayList<>();

    public Profile(long id, String phoneNumber, String userName, String pasword, Status status, Profile profile, List<Profile> contact, List<String> message) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.pasword = pasword;
        this.status = status;
        this.profile = profile;
        this.contact = contact;
        this.message = message;
    }

    public Profile(long id, String userName, String pasword, String phoneNumber, List<Profile> contacts, List<String> message, Status вСпортзале) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Profile> getContact() {
        return contact;
    }

    public void setContact(List<Profile> contact) {
        this.contact = contact;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", pasword='" + pasword + '\'' +
                ", status=" + status +
                ", profile=" + profile +
                ", contact=" + contact +
                ", message=" + message +
                '}';

    }
}



