package it.develhope.interfaces;
class Professor extends CollegePerson implements TeachingPerson
{
    String teachingSubject;
    public Professor(String name, String surname, int collegeId, String teachingSubject)
    {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }
    public void teachToOtherPeople()
    {
        System.out.println("Subject: " + teachingSubject);
    }
}