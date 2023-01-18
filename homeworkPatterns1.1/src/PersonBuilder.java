public class PersonBuilder {
    private String name = null;
    private String surname = null;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null) {
            throw  new IllegalStateException("Не указано имя");
        } else if (this.surname == null) {
            throw  new IllegalStateException("Не указана фамилия");
        }

        Person result = new Person(this.name, this.surname, this.age);
        result.setAddress(this.address);
        return  result;
    }
}
