public class University {

    private String name;

    public University(String name) {
        this.name = name;
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
     *
     * FOR PROTOTYPE BEAN SCOPE DESTROY-METHOD WILL NOT BEEN CALLING
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

}
