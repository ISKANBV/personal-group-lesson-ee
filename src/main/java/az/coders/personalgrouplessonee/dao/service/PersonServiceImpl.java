package az.coders.personalgrouplessonee.dao.service;

import az.coders.personalgrouplessonee.dao.entity.PersonEntity;
import az.coders.personalgrouplessonee.dao.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(PersonEntity person) {
        repository.save(person);
    }

    @Override
    public List<PersonEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public PersonEntity getById(long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("id not found!"));
    }

    @Override
    public void update(PersonEntity person) {
        PersonEntity person1 = getById(person.getId());
        person1.setAge(person.getAge());
        person1.setName(person.getName());
        person1.setSurname(person.getSurname());
        repository.save(person1);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public List<PersonEntity> getPersonFlight() {
        return repository.getPersonFlight();
    }
}
