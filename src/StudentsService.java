import java.util.HashSet;
import java.util.Scanner;

public class StudentsService {

    HashSet<Students> studentsHashSet = new HashSet<Students>();

    Students student1 = new Students("Krystian", "Raczyński", 42757, "Informatyk", 1);
    Students student2 = new Students("Marcin", "Domagała", 42321, "Informatyk", 1);
    Students student3 = new Students("Fabian", "Fabiańczyk", 42315, "Elektryk", 2);
    Students student4 = new Students("Marcin", "Marcinkowski", 42891, "Logistyk", 3);

    Scanner scanner = new Scanner(System.in);
    boolean found= false;
    String nameStudent;
    String surname;
    int indexNumber;
    String profile;
    int yearStudy;

    public StudentsService(){

        studentsHashSet.add(student1);
        studentsHashSet.add(student2);
        studentsHashSet.add(student3);
        studentsHashSet.add(student4);
    }

    //add Students
    public void addStudents(){
        System.out.println("Enter Name: ");
        nameStudent = scanner.next();

        System.out.println("Enter Surname: ");
        surname = scanner.next();

        System.out.println("Enter indexNumber: ");
        indexNumber = scanner.nextInt();

        System.out.println("Enter profile: ");
        profile = scanner.next();

        System.out.println("Enter YearStudy: ");
        yearStudy = scanner.nextInt();

        Students std = new Students(nameStudent, surname, indexNumber, profile, yearStudy);

        studentsHashSet.add(std);

        System.out.println("Successfully added a new student!" + std);
    }

    //view all students
    public void viewAllStudents(){
        for(Students std:studentsHashSet) {
            System.out.println(std);
        }
    }

    //searchStudents by name
    public void searchStudents(){
        System.out.println("Enter name: ");
        nameStudent = scanner.next();
        for(Students std:studentsHashSet){
            if(std.getNameStudent().equals(nameStudent)){
                System.out.println(std);
                found = true;
            }
        }
        if(!found){
            System.out.println("There is no such Student");
        }

    }

    //search student by surname
    public void searchStudentsSurname(){
        System.out.println("Enter Surname: ");
        surname = scanner.next();
        for(Students std:studentsHashSet){
            if(std.getSurname().equals(surname)){
                System.out.println(std);
                found = true;
            }
        }
        if(!found){
            System.out.println("There is no such Student");
        }
    }

    //search student by profile
    public void searchStudentsProfile(){
        System.out.println("Enter profile: ");
        profile = scanner.next();
        //String profile = scanner.next();
        for(Students std:studentsHashSet){
            if(std.getProfile().equals(profile)){
                System.out.println(std);
                found = true;
            }
        }
        if(!found){
            System.out.println("There is no such Student");
        }
    }

    //searchStudents by index
    public void searchStudentsId(){
        System.out.println("Enter index: ");
        indexNumber = scanner.nextInt();
        for(Students std:studentsHashSet){
            if(std.getIndexNumber()==indexNumber){
                System.out.println(std);
                found = true;
            }
        }
        if(!found){
            System.out.println("There is no such Student");
        }
    }

    //update the students
    public void updateStudents(){
        System.out.println("Enter indexNumber:  ");
        indexNumber=scanner.nextInt();
        for(Students std:studentsHashSet){
            if(std.getIndexNumber()==indexNumber) {
                System.out.println("Enter new Name: ");
                nameStudent=scanner.next();

                System.out.println("Enter new Surname: ");
                surname=scanner.next();

                System.out.println("Enter new profile: ");
                profile=scanner.next();

                System.out.println("Enter new YearStudy: ");
                yearStudy=scanner.nextInt();

                std.setNameStudent(nameStudent);
                std.setSurname(surname);
                std.setProfile(profile);
                std.setYearStudy(yearStudy);

                System.out.println(std);
                found=true;
            }
        }
        if(!found) {
            System.out.println("No student index found " + indexNumber);
        } else {
            System.out.println("The student with index " + indexNumber + " has been updated!");
        }
    }

    //delete students
    public void deleteStudents(){
        System.out.println("Enter indexNumber: ");
        indexNumber = scanner.nextInt();
        boolean found = false;
        Students stdDelete = null;
        for (Students std:studentsHashSet) {
            if(std.getIndexNumber()==indexNumber) {
                stdDelete=std;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student index found " + indexNumber);
        } else {
            studentsHashSet.remove(stdDelete);
            System.out.println("The student with index " + indexNumber + " has been deleted!");
        }
    }

}
