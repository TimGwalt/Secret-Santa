package app;

public class Person {

    private String name, partnerName, assignment;
    private boolean inCouple, assigned;


    /**
     * Creates a new Person with only a name as an input.
     * @param n is the naem of the person.
     */
    public Person(String n) {
        name = n;
        inCouple = false;
        partnerName = null;
        assigned = false;
        assignment = null;
    }

    /**
     * Creates a new Person with all three variables.
     * @param n is the name of the person.
     * @param couple states whether the person is part of a couple.
     * @param partName is the name of the person's partner.
     */
    public Person(String n, boolean couple, String partName) {
        name = n;
        inCouple = couple;
        partnerName = partName;
        assigned = false;
        assignment = null;
    }

    /**
     * GetName() returns the name of the person.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * GetPartnerName() returns the name of the person's partner.
     * @return partnerName.
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * IsCouple() returns inCouple.
     * @return inCouple.
     */
    public boolean isInCouple() {
        return inCouple;
    }

    /**
     * IsAssigned returns whether or not a person has been assiigned or not.
     * @return assigned
     */
    public boolean isAssigned() {
        return assigned;
    }

    /**
     * GetAssignment() returns the name of the assigned person. 
     */
    public String getAssignment() {
        return assignment;
    }


    /**
     * SetName() sets the name of the of the person.
     * @param n is the new name of the person.
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * SetInCouple() set the person's relationship status.
     * @param isCouple is the new realtionship status of the person.
     */
    public void setInCouple(boolean isCouple) {
        inCouple = isCouple;
    }

    /**
     * SetPartnerName() sets the name of the person's partner.
     * @param partName the new name of the partner.
     */
    public void setPartnerName(String partName) {
        partnerName = partName;
    }

    /**
     * SetAssign() sets whether or not someone has been assigned to
     * another person.
     */
    public void setAssign(boolean assign) {
        assigned = assign;
    }

    /**
     * SetAssignments() sets the name of the person the
     * current person is assigned to.
     */
    public void setAssignment(String assignedPerson) {
        assignment = assignedPerson;
    }
}