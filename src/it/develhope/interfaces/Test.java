package it.develhope.interfaces;
public class Test{
    public static void main(String[] args) {
        Student student = new Student("Giovanni", "Rossi", 852, 1);
        Professor professor = new Professor("Paolo", "Bianchi", 654, "History");
        Assistant assistant = new Assistant("Mirko", "Neri", 753, false);
        student.goToCollege();
        System.out.println("------------------------------------------");
        professor.goToCollege();
        System.out.println("------------------------------------------");
        assistant.goToCollege();
        System.out.println("------------------------------------------");
        student.studyAtHome();
        System.out.println("------------------------------------------");
        professor.teachToOtherPeople();
        System.out.println("------------------------------------------");
        assistant.studyAtHome();
        System.out.println("------------------------------------------");
        assistant.teachToOtherPeople();
        System.out.println("------------------------------------------");
    }
}
