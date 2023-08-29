public class Main {
    public static void main(String[] args) {

        Student naveen = new Student();

        naveen.studentId = "2024ENG0012";
        naveen.studentDepartment = "CSE";

        System.out.println(naveen.studentId);
        System.out.println(naveen.studentDepartment);

    }
}

    class Student{
        String studentId;
        String studentDepartment;

    }

