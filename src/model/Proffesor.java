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

    public void setP_ID() {
        this.p_ID = counter;
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
        if(surname != null && surname.matches("[A-Z]{1}[a-z]+")) {
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

    public Proffesor( String name, String surname, String degree) {
        setP_ID();
        this.name = name;
        this.surname = surname;
        this.degree = degree;
    }

    public Proffesor(){

    }

    @Override
    public String toString() {
        return "Proffesor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}
