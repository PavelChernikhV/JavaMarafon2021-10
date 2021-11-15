package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Adam","G12");
        student.printInfo();
        System.out.println(student);

        Teacher teacher = new Teacher("Gimme","Music");
        teacher.printInfo();
        System.out.println(teacher);
    }
}
