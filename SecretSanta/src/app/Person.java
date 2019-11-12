package app;

public class Person {

    private String name, partnerName;
    private boolean inCouple;


    /**
     * Creates a new Person with only a name as an input.
     * @param n is the naem of the person.
     */
    public Person(String n) {
        name = n;
        inCouple = false;
        partnerName = null;
    }

    /**
     * Creates a new Person with all three variables.
     * @param n is the name of the person.
     * @param couple states whether the person is part of a couple.
     * @param partName is the name of the person's partner.
     */
    public Person(String n, boolean couple, String partName) {
        name = n;
        couple = inCouple;
        partnerName = partName;
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
    public void SetPartnerName(String partName) {
        partnerName = partName;
    }
}