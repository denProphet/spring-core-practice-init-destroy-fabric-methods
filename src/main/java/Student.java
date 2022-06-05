public class Student {

    private String name;
    private String surname;
    private int course;
    private int speciality;
    private boolean isBudget;

    /**
     * Private constructor does not allow us to create instance using new operator
     * We want to use own fabric method
     */

    private Student() {}

    /**
     * Using own fabric method instead of new operator object creation
     */

    public static Student getStudent() {
        System.out.println("Act of fabric method invocation");
        return new Student();
    }

    /**
     * Init-method declaration
     * Spring will call this init-method BEFORE BEAN CREATING
     * We can declare some acts that have to be happened BEFORE BEAN CREATING
     */

    public void beanInit() {
        System.out.println("Act of  init-method invocation");
    }

    /**
     * Destroy-method declaration
     * Spring will call this instance destroy-method BEFORE CONTEXT CLOSING (PROGRAM ENDING)
     * We can declare some acts that have to be happened BEFORE CONTEXT CLOSING (PROGRAM ENDING)
     */

    public void beanDestroy() {
        System.out.println("Act of  destroy-method invocation");
    }

    /**
     * Setters and getters declaration
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }

    public boolean getIsBudget() {
        return isBudget;
    }

    public void setIsBudget(boolean budget) {
        isBudget = budget;
    }
}
