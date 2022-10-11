package Model;

import doll.User;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    String Speciallity;
//Construyendo un constructor
    public Doctor(String Name, String email){
        super(Name, email);
        System.out.println("El nombre del doctor es: "+Name);
        this.Speciallity=Speciallity;
    }

    public String getSpeciallity() {
        return Speciallity;
    }

    public void setSpeciallity(String speciallity) {
        Speciallity = speciallity;
    }

   ArrayList<AvailableAppointment> availableAppointments= new ArrayList<>();
    public void addAvailableAppintment(Date date, String Time){
      availableAppointments.add(new AvailableAppointment(date,Time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public String toString(){
        return super.toString() +"Especialidad: " +Speciallity+ "Availables: "+ availableAppointments.toString();
    }

    //Clases Estaticas Anidadas

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String Time;

        public AvailableAppointment(Date date, String Time){
            this.date=date;
            this.Time=Time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return Time;
        }

        public void setTime(String time) {
            Time = time;
        }
        public String toString(){
            return  "Available Appointment \nDate: "+date+"Time: "+Time;
    }

    }

}
