public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
        this.name = null;
        this.surname = null;
        this.age = -1;
    }

    public PersonBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(final String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(final int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(final String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null) {
            throw new IllegalStateException("Не указано имя");
        }
        if (this.surname == null) {
            throw new IllegalStateException("Не указана фамилия");
        }
        final Person result = new Person(this.name, this.surname, this.age);
        result.setAddress(this.address);
        return result;
    }
}
