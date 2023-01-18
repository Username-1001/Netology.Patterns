public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(final String name, final String surname) {
        this.address = null;
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public Person(final String name, final String surname, final int age) {
        this.address = null;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return this.age >= 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public boolean happyBirthday() {
        if (!this.hasAge()) {
            return false;
        }
        ++this.age;
        return true;
    }

    public PersonBuilder newChildBuilder() {
        final PersonBuilder builder = new PersonBuilder();
        builder.setSurname(this.surname);
        builder.setAge(0);
        builder.setAddress(this.address);
        return builder;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
