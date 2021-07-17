package models;

public class Person {
    String fName = "Mark";
    String lName = "Tven";
    String email = "markT35@gmail.com";
    String address = "USA";

    public Person withFName(String fName) {
        this.fName = fName;
        return this;
    }

    public Person withlName(String lName) {
        this.lName = lName;
        return this;
    }

    public Person withEmail(String email) {
        this.email = email;
        return this;
    }

    public Person withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
