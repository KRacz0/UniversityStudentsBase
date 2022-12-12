import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class StudentsService {

    HashSet<Student> studentHashSet = new HashSet<Student>();

    Student student1 = new Student("Krystian", "Raczyński", 42757, "Informatyk", 1);
    Student student2 = new Student("Marcin", "Domagała", 42321, "Informatyk", 1);
    Student student3 = new Student("Fabian", "Fabiańczyk", 42315, "Elektryk", 2);
    Student student4 = new Student("Marcin", "Marcinkowski", 42891, "Logistyk", 3);

    Scanner scanner = new Scanner(System.in);
    boolean found= false;
    String nameStudent;
    String surname;
    int indexNumber;
    String profile;
    int yearStudy;

    public StudentsService() throws IOException {

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

    }





    //add Students
    public void addStudents(){
        System.out.println("<---------- Add a new student ---------->");
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

        Student std = new Student(nameStudent, surname, indexNumber, profile, yearStudy);
        studentHashSet.add(std);
        System.out.println("Successfully added a new student!" + std);
    }

    //view all students
    public void viewAllStudents(){
        System.out.println("<---------- List of students ---------->");
        for(Student std: studentHashSet) {
            System.out.println(std);
        }
    }

    //searchStudents by name
    public void searchStudents(){
        System.out.println("Enter name: ");
        nameStudent = scanner.next();
        System.out.println("<---------- List of students with name " + nameStudent + "  ---------->");
        for(Student std: studentHashSet){
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
        System.out.println("<---------- List of students with surname " + surname + " ---------->");
        for(Student std: studentHashSet){
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
        System.out.println("<---------- List of students with profile " + profile + " ---------->");
        for(Student std: studentHashSet){
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
        System.out.println("<---------- List of students with index" + indexNumber + " ---------->");
        for(Student std: studentHashSet){
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
        indexNumber = scanner.nextInt();
        for(Student std: studentHashSet){
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
        Student stdDelete = null;
        for (Student std: studentHashSet) {
            if(std.getIndexNumber()==indexNumber) {
                stdDelete=std;
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student index found " + indexNumber);
        } else {
            studentHashSet.remove(stdDelete);
            System.out.println("The student with index " + indexNumber + " has been deleted!");
        }
    }

    public void caseOptions(){
        System.out.println("Select a search method: ");
        System.out.println("1. Search Students by Name ");
        System.out.println("2. Search Students by Surname");
        System.out.println("3. Search Students by Index");
        System.out.println("4. Search Students by Profile");
    }


    public void serialization() throws IOException {
        FileOutputStream fos = new FileOutputStream("students.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.studentHashSet);
        System.out.println("zserializowano");
    }

    public void deserialization() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("students.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        this.studentHashSet = (HashSet<Student>) ois.readObject();
        System.out.println("zdeserializowano");
    }

}
