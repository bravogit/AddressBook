package addressbookmain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddressBookMain {

    public AddressBook book;

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        ab.addPerson(new Person("Barack", "Obama", "The White House", 8850));
        ab.addPerson(new Person("Homer", "Simpson", "Springfield", 8856));
        ab.print();
    }
}
