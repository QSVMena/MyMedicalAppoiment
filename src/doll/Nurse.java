package doll;

import doll.User;

public class Nurse extends User {

    private String Speciallity;

    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciallity() {
        return Speciallity;
    }

    public void setSpeciallity(String speciallity) {
        Speciallity = speciallity;
    }
}
