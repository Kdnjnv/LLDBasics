package LLDQuestions.libraryManagement;


public class Person {
    private String name;
    private Address address;
    private String email;

    public Person(String name, Address address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public Person() {
        this.name = "name";
        this.address = new Address();
        this.email = "email";
    }

    public String printPerson() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: " + name + '\n');
        sb.append("email: " + email + "\n");
        sb.append("address: " + address.printAddress() + "\n");
        //System.out.println(sb.toString());
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
