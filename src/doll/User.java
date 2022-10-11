package doll;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phonenumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        if (phonenumber.length()>8 ){
            System.out.println("El numero telefonico deber ser 8 digitos");
        }else{
            this.phonenumber=phonenumber;
        }
        this.phonenumber = phonenumber;
    }

    public String toString(){
        return "doll.User: "+name+" Email: "+email+
                "\nAddress: "+address+ " Phone: "+phonenumber;
    }

}
