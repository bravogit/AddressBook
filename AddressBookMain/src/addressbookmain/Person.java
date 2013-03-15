package addressbookmain;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private String lastName;
    private String address;
    private int zip;

    public Person(String name, String lastName, String address, int zip) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.zip = zip;
    }

    Person() {
        name = "";
        lastName = "";
        address = "";
        zip = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getFullName() {
        return "Nome: " + name + " " + lastName;
    }

    public String getFullDetails() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Nome: " + name + " " + lastName + "\nIndirizzo: " + address + "\n" + "CAP: " + zip;
    }

    public int comparaCognomi(Object p) {
        return lastName.compareTo(((Person) p).lastName);
    }

    @Override
    public int compareTo(Person t) {
        return this.getName().compareTo(t.getName());
    }
    public static Comparator<Person> comparaCognomi = new Comparator<Person>() {
        public int compare(Person person1, Person person2) {
            String s1 = person1.lastName;
            String s2 = person2.lastName;
            return s1.compareTo(s2);
        }
    };

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (this.zip != other.zip) {
            return false;
        }
        return true;
    }
    public static Comparator<Person> compareZip = new Comparator<Person>() {
        @Override
        public int compare(Person person1, Person person2) {
            int o1 = person1.zip;
            int o2 = person2.zip;
            return (o1 < o2 ? -1 : (o1 == o2 ? 0 : 1));
        }
    };
}