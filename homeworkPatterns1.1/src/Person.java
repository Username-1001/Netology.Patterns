public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public boolean happyBirthday() {
        if (!hasAge()) {
            return  false;
        } else {
            this.age++;
            return true;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setSurname(this.surname);
        builder.setAge(0);
        builder.setAddress(this.address);

        return  builder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
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