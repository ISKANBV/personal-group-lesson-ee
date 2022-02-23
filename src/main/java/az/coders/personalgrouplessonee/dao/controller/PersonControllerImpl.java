package az.coders.personalgrouplessonee.dao.controller;

import az.coders.personalgrouplessonee.dao.entity.PersonEntity;
import az.coders.personalgrouplessonee.dao.service.PersonServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonControllerImpl implements PersonController{

    private final PersonServiceImpl service;

    public PersonControllerImpl(PersonServiceImpl service) {
        this.service = service;
    }

    @Override
    @PostMapping("/add")
    public void add(@RequestBody PersonEntity person) {
        service.add(person);
    }

    @Override
    @GetMapping("/all")
    public List<PersonEntity> getAll() {
        return service.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public PersonEntity getById(@PathVariable(value = "id") long id) {
        return service.getById(id);
    }

    @Override
    @PutMapping("/")
    public void update(@RequestBody PersonEntity person) {
        service.update(person);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") long id) {
        service.delete(id);
    }

    @Override
    @DeleteMapping("/all")
    public void deleteAll() {
        service.deleteAll();
    }

    @Override
    @GetMapping("/flights")
    public List<PersonEntity> getPersonFlight() {
        return service.getPersonFlight();
    }
}
