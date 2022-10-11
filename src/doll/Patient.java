package doll;

import doll.User;

public class Patient extends User {
    private String birthdate;
    private double weight;
    private double hight;
    private String blood;

    public Patient(String name, String email){
        super(name, email);
    }

    public void setWeight(double weight){
        this.weight=weight;
    }

    public String getWeight(){
        return this.weight+ "Kg.";
    }

    public String getHight() {
        return hight + "Mts.";
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String toString(){
        return "Birthdate: "+birthdate+ " Peso: "+getWeight()+
                " Altura: "+getHight()+ "Tipo de sangra: "+blood;
    }
}
