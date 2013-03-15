package addressbookmain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddressBookMain {

    public AddressBook book;

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        ab.addPerson(new Person("Eddy", "Rubi", "Via mia.", 8850));
        ab.addPerson(new Person("Giacomo", "Francia", "Via sua.", 8856));
        ab.updatePerson(new Person("Giacomo", "Rubi", "Via d'egli.", 8856));
        ab.print();
    }
}