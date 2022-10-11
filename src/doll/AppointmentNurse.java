package doll;
import doll.Nurse;
import doll.Patient;
import misc.IScheduleable;

import java.sql.Date;

public class AppointmentNurse implements IScheduleable {
    private int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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

    private String Time;

    @Override
    public void Schedule(java.util.Date date, String Time) {

    }
}
