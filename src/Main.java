import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("caoxi");
        student.setAge(24);
        student.setGender("female");
        student.setId(311);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getId());
    }
}
