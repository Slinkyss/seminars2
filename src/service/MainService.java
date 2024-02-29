package service;
import model.Degree;
import model.Professor;
import model.*;

import java.util.ArrayList;

public class MainService {

    private static ArrayList<Professor> professors = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Grade>  grades = new ArrayList<>();
    public static void main(String[] args){



        Professor pr1 = new Professor();
        Professor pr2 = new Professor("bobs","Titatrs",Degree.phd);
        professors.add(pr1);
        professors.add(pr2);


        Student student1 = new Student();
        Student student2 = new Student("Liesma","Mandarina");

        for(Professor temp : professors){
            System.out.println(temp);
        }
        System.out.println();

        Grade gr1 = new Grade();


    }
    public static float calculateAVGrade(Student student) throws Exception {
        if (student == null) throw new Exception("Problems with input student");

        float sum = 0;
        int howMany = 0;

        for (Grade temp : grades) {
            if (temp.getStudent().equals(student)) {
                sum = sum + temp.getValue();
                howMany++;
            }
        }
        return sum/howMany;
    }

    public static float weightAverageGrades(Student student) throws Exception {

        float sum = 0;
        int howManyCP = 0;

        for (Grade temp : grades) {
            if (temp.getStudent().equals(student)) {
                sum = sum + temp.getValue() * temp.getCourse().getCreditPoints();
                howManyCP = howManyCP + temp.getCourse().getCreditPoints();
                howManyCP++;
            }

        }
        return sum/ howManyCP;
    }
}
