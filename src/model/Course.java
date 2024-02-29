package model;

public class Course {
    private long c_ID;

    private String title;

    private int creditPoints;

    private static long counter = 0;
    private Proffesor proffesor;

    public long getC_ID() {
        return c_ID;
    }

    public void setC_ID() {
        this.c_ID = counter;
        counter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != null && title.matches("[A-Z]{1}[a-z]+")) {
            this.title = title;
        }
        else{
            this.title = "-----";
        }
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {
        if(creditPoints > 0 && creditPoints <=20)
            this.creditPoints = creditPoints;
        else
            this.creditPoints = 2;
    }

    public Proffesor getProffesor() {
        return proffesor;
    }

    public void setProffesor(Proffesor proffesor) {
        this.proffesor = proffesor;
    }

    public Course(){
        setC_ID();
        setTitle("Matene");
        setCreditPoints(4);
        setProffesor(new Proffesor());
    };

    public Course(String title, int creditPoints, Proffesor proffesor) {
        setC_ID();
        setTitle(title);
        setCreditPoints(creditPoints);
        setProffesor(proffesor);
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_ID=" + c_ID +
                ", title='" + title + '\'' +
                ", creditPoints=" + creditPoints +
                ", proffesor=" + proffesor + // izsaugta profesora string funkcija
                '}';
    }
}
