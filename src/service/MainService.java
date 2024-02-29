package service;
import model.Degree;
import model.Proffesor;
import model.*;
public class MainService {
    public static void main(String[] args){

        Proffesor pr1 = new Proffesor();
        Proffesor pr2 = new Proffesor("bobs","Titatrs",Degree.phd);

        System.out.println(pr1);
        System.out.println(pr2);

        Student student1 = new Student();
        Student student2 = new Student("Liesma","Mandarina");

        System.out.println();

        Grade gr1 = new Grade();
    }
}
