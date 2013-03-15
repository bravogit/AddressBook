package addressbookmain;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddressBook {

    public List<Person> persons;
    private File f;

    public AddressBook() {
        persons = new LinkedList();
    }

    public void print() {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void orderbylastName() {
        Collections.sort(persons, Person.comparaCognomi);
    }

    public void orderbyZip() {
        Collections.sort(persons,Person.compareZip);
    }

    public void addPerson(Person p) {
        persons.add(p);
    }

    public void removePerson(Person p) {
        persons.remove(p);
    }

    public Person searchByName(String n) {
        Iterator<Person> it = persons.iterator();
        Person p = null;
        for (Person i : persons) {
            if (i.getName().equals(n)) {
                return i;
            }
        }
        return null;
    }

    public void updatePerson(Person p) {
        Iterator<Person> it = persons.iterator();
        for (Person i : persons) {
            if (i.getName().equals(p.getName())) {
                i.setAddress(p.getAddress());
                i.setLastName(p.getLastName());
                i.setZip(p.getZip());
                return;
            }
            if (i.getLastName().equals(p.getLastName())) {
                i.setAddress(p.getAddress());
                i.setName(p.getName());
                i.setZip(p.getZip());
                return;
            }   
        }
    }

    public int getNumberOfPersons() {
        return persons.size();
    }
}