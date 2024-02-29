package model;

public class Student {

    private long ID;
    private String name;
    private String surname;

    private static long counter1 = 0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(){

    }

    public long getID() {
        return ID;
    }

    public void setID() {
        this.ID = counter1;
        counter1++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.matches("[A-Z]{1}[a-z]+")) {
            this.name = name;
        }
        else{
            this.name = "-----";
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(name != null && name.matches("[A-Z]{1}[a-z]+")) {
            this.surname = surname;
        }
        else{
            this.surname = "-----";
        }
    }
}
