package homework2;

/**
 * Holds information about person.
 */
public class Person {
    private String name;
    private int birthYear;

    public void setNameAndYear(String name1, int year) {
        this.name = name1;
        this.birthYear = year;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear <= 0) {
            throw new IllegalArgumentException("Birth year should be greater than 0: " + birthYear);
        }
        this.birthYear = birthYear;
    }

    /**
     * String representation of person.
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("Person(name=%s, birthYear=%s)", name, birthYear);
    }
}