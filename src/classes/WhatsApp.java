package classes;

public class WhatsApp {
    private Passport person;
    private String password;
    private Profile profile;
    private String userName;

    public WhatsApp(Passport person, String password, Profile profile, String userName) {
        this.person = person;
        this.password = password;
        this.profile = profile;
        this.userName = userName;
    }

    public Passport getPerson() {
        return person;
    }

    public void setPerson(Passport person) {
        this.person = person;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "WhatsApp{" +
                "person=" + person +
                ", password='" + password + '\'' +
                ", profile=" + profile +
                ", userName='" + userName + '\'' +
                '}';
    }

    public Object getPasword() {
        return null;
    }
}


