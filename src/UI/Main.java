package UI;

import Model.Doctor;
import doll.Patient;
import java.util.Date;

public class Main {
    public static void main (String[] args ){

        //bll.UIMenu.ShowMenu();
        Doctor myDoctor = new Doctor("Sinai", "Pediatra");
        myDoctor.addAvailableAppintment(new Date(),"10 am");
        myDoctor.addAvailableAppintment(new Date(),"12 am");
        myDoctor.addAvailableAppintment(new Date(),"1 pm");

        for (Doctor.AvailableAppointment addA:myDoctor.getAvailableAppointments()) {
            System.out.println(addA.getDate()+" "+ addA.getTime());
        }
        /*System.out.println(myDoctor.Name);
        System.out.println(myDoctor.Speciallity);*/

        Patient patient = new Patient("Sinai", "quiezelvillagra@gmail.com");
        /*patient.setWeight(53.4);
        System.out.println(patient.getWeight());

        patient.setPhonenumber("84025120");
        System.out.println(patient.getPhonenumber());*/

        System.out.println(patient);

    }
}
