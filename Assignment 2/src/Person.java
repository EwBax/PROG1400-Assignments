public abstract class Person {

    // Properties
    private String address;
    private String name;


    // Getters and setters---------------------------------------------------------------------------

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract Methods

    @Override
    abstract public String toString();

    abstract public double invoice();
}
