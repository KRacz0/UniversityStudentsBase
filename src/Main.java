import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentsService studentsService = new StudentsService();



        int choice;
        do {
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. UPDATE");
            System.out.println("6. EXIT");
            System.out.println("Enter Your Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentsService.addStudents();
                    break;
                case 2:
                    studentsService.viewAllStudents();
                    break;

                case 3:
                    studentsService.searchStudents();
                    studentsService.searchStudentsSurname();
                    studentsService.searchStudentsId();
                    studentsService.searchStudentsProfile();
                    break;

                case 4:
                    studentsService.deleteStudents();
                    break;

                case 5:
                    studentsService.updateStudents();
                    break;
            }
        } while (choice != 0);
    }
}