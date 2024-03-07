package service;
import model.Degree;
import model.Professor;
import model.*;

import java.util.ArrayList;

public class MainService {

    private static ArrayList<Professor> professors = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Grade>  grades = new ArrayList<>();

    private static ArrayList<Course>  courses = new ArrayList<>();
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

    public static float calculateAvgGradeOfCourse(Course course) throws Exception{
        if (course == null) throw new Exception("Problems with input course");
        float sum = 0;
        int howMany = 0;

        for(Grade tempGr : grades) {
            if(tempGr.getCourse().equals(course)) {
                sum += tempGr.getValue();
                howMany++;
            }
        }

        if(howMany == 0) throw new Exception("There are no grades in this course");

        return sum/howMany;
    }

    public static int howManyCourses(Professor professor)throws Exception{
        if (professor == null) throw new Exception("Problems with input course");
        int howMany = 0;

        for(Course Tempcourse : courses) {
            if(Tempcourse.getProffesor().equals(professor)){
                howMany++;
            }
        }

        return howMany;


    }

    public static void sortByGrade(){

    }

    //CRUD CREATE RETRIEVE UPDATE DELETE

    public static void createStudent(String name, String surname)throws  Exception{
        if(name == null || surname == null) throw new Exception("Problems with input arguments");

        boolean isFound = false;

        for(Student tempSt : students){
            if(tempSt.getName().equals(name) && tempSt.getSurname().equals(surname))
            {
                isFound = true;
                break;
            }

            if(!isFound){
                Student st = new Student(name, surname);
                students.add(st);
            }
        }
    }

    //retrieve by surname

    public static Student retrieveByStudentSurname(String surname)throws  Exception{
        if(surname == null) throw new Exception("Problems with input arguments");

        for (Student tempSt : students){
            if(tempSt.getSurname().equals(surname)){
                return tempSt;
            }
        }
        throw new Exception(surname + "is not in our system");
    }

    public static void updateStudentBy(String name, String surname,String newSurname)throws  Exception{
        if(name == null || surname == null) throw new Exception("Problems with input arguments");


        for(Student tempSt : students){
            if(tempSt.getName().equals(name) && tempSt.getSurname().equals(surname))
            {
                tempSt.setSurname(newSurname);
                return;
            }


            }
        throw new Exception(name +  " " + surname + "is not registered in system");
    }

    public static void deleteBySurname(String name, String surname)throws  Exception{
        if(surname == null) throw new Exception("Problems with input arguments");
        for (Student tempSt : students){
            if(tempSt.getSurname().equals(surname) && tempSt.getName().equals(name)){
                students.remove(tempSt);
            }
        }

    }

}
