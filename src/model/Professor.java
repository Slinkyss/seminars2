package model;

public class Professor {

    private long p_ID;
    private String name;
    private String surname;
    private Degree degree;

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

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Professor(String name, String surname, Degree degree) {
        setP_ID();
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }

    public Professor(){
        setP_ID();
        setName("Default");
        setSurname("Default");
        setDegree(Degree.other);


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
