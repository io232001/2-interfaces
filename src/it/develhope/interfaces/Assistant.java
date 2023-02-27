package it.develhope.interfaces;
class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    boolean isGoingToBeAPhD;
    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD)
    {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    public void studyAtHome()
    {
        System.out.println("Going to be a Ph.D.: " + isGoingToBeAPhD);
    }

    public void teachToOtherPeople()
    {
        System.out.println("Going to be a Ph.D.: " + isGoingToBeAPhD);
    }
}
