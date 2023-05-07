package homeworkcurs14;

import org.fasttrackit.Person;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAge() {
        Person person = new Person("John", -10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullName() {
        Person person = new Person(null, 25);
    }
}

public class PersonServiceTest {

    @Test
    public <PersonService> void testAddPerson() {
        PersonService service;
        service = new PersonService();
        Person person = new Person("John", 25);
        Person result = service.clone(person);
        assertNotNull(result.getId());
    }

    @Test(expected = PersonNotFoundException.class)
    public void testRemovePerson() {
        PersonService service = new PersonService();
        Person person = new Person("John", 25);
        Person addedPerson = service.addPerson(person);
        Person removedPerson = service.removePerson(addedPerson.getId());
        assertEquals(addedPerson, removedPerson);
        service.getPersonById(addedPerson.getId());
    }

    @Test
    public void testGetAllPersons() {
        PersonService service = new PersonService();
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Mary", 30);
        service.addPerson(person1);
        service.addPerson(person2);
        List<Person> result = service.getAllPersons();
        assertTrue(result.contains(person1));
        assertTrue(result.contains(person2));
    }

    @Test
    public void testGetPersonsOlderThan() {
        PersonService service = new PersonService();
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Mary", 30);
        Person person3 = new Person("Peter", 35);
        service.addPerson(person1);
        service.addPerson(person2);
        service.addPerson(person3);
        List<Person> result = service.getPersonsOlderThan(30);
        assertEquals(2, result.size());
        assertTrue(result.contains(person2));
        assertTrue(result.contains(person3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAgeForGetPersonsOlderThan() {
        PersonService service = new PersonService();
        service.getPersonsOlderThan(-10);
    }

    @Test
    public void testGetAllPersonNames() {
        PersonService service = new PersonService();
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Mary", 30);
        service.addPerson(person1);
        service.addPerson(person2);
        List<String> result = service.getAllPersonNames();
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Mary"));
        assertEquals(2, result.size());
    }

    @Test
    public void testGetPerson() {
        PersonService service = new PersonService();
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Mary", 30);
        service.addPerson(person1);
        service.addPerson(person2);
        Person result = service.getPerson("Mary");
        assertEquals(person2, result);
    }

    @Test(expected = PersonNotFoundException.class)
    public void testGetPersonNotFound() {
        PersonService service = new PersonService();
        service.getPerson("John");
    }

    @Test
    public void testGetPersonById() {
        PersonService service = new PersonService();
        Person person1 = new Person

