package model;

public class Proffesor {

    private long p_ID;
    private String name;
    private String surname;
    private String degree;

    private static long counter = 0;




    public long getP_ID() {
        return p_ID;
    }

    public void setP_ID(long p_ID) {
        this.p_ID = p_ID;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        if(degree != null)
            this.degree = degree;
        else
            this.degree = null;
    }

    public Proffesor(long p_ID, String name, String surname, String degree) {
        this.p_ID = p_ID;
        this.name = name;
        this.surname = surname;
        this.degree = degree;
    }

    public Proffesor(){

    }
}
