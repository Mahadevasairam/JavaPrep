public class Name {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void getName(){
        System.out.println(firstName+" "+lastName);
    }

    public static void main(String[] args) {
        Name n = new Name();
        n.setFirstName("Sudhir");
        n.setLastName("Dhangar");
        n.getName();
    }
}
