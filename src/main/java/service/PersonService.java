package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Steve");
		p.setLastName("Smith");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Tom");
		p.setLastName("Brown");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(33);
		p.setFirstName("ttttt");
		p.setLastName("rrrrr");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("fffffff");
		p.setLastName("yyyyyy");
		persons.add(p);
		
		p = new Person();
		p.setId("5");
		p.setAge(25);
		p.setFirstName("rrrrrr");
		p.setLastName("uuuuuu");
		persons.add(p);
		
		p = new Person();
		p.setId("6");
		p.setAge(25);
		p.setFirstName("test7777");
		p.setLastName("test7777");
		persons.add(p);
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

