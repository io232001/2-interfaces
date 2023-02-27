package it.develhope.interfaces;
class Student extends CollegePerson implements LearningPerson {
    int academicYear;
    public Student(String name, String surname, int collegeId, int academicYear)
    {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }
    public void studyAtHome()
    {
        System.out.println("Year: " + academicYear);
    }
}