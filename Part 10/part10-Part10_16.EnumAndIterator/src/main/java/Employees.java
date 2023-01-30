
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    List<Person> person;

    public Employees() {
        this.person = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.person.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> people = peopleToAdd.iterator();
        while (people.hasNext())
            this.person.add(people.next());
    }
    
    public void print() {
        Iterator<Person> persons = this.person.iterator();      
        while (persons.hasNext()) 
            System.out.println(persons.next());
    }
    
    public void print(Education education) {
        Iterator<Person> persons = this.person.iterator();
        while (persons.hasNext()) {
            Person p = persons.next();
            if (p.getEducation() == education)
                System.out.println(p);
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> persons = this.person.iterator();
        while (persons.hasNext()) {
            Person p = persons.next();
            if (p.getEducation() == education)
                persons.remove();
        }
    }
}
