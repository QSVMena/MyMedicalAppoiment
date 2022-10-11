package doll;
import Model.Doctor;
import doll.Patient;
import misc.IScheduleable;

import java.util.Date;

public class AppointmentDoctor implements IScheduleable {
    private int id;
    private Patient patient;
    private Doctor doctor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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

    private Date date;
    private String Time;

    @Override
    public void Schedule(Date date, String Time) {

    }
}
