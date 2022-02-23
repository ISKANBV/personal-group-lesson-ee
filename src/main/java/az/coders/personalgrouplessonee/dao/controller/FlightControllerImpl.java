package az.coders.personalgrouplessonee.dao.controller;

import az.coders.personalgrouplessonee.dao.entity.FlightEntity;
import az.coders.personalgrouplessonee.dao.service.FlightServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightControllerImpl implements FlightController{

    private final FlightServiceImpl service;

    public FlightControllerImpl(FlightServiceImpl service) {
        this.service = service;
    }

    @Override
    @PostMapping("/add")
    public void add(@RequestBody FlightEntity flight) {
        service.add(flight);
    }

    @Override
    @GetMapping("/all")
    public List<FlightEntity> getAll() {
        return service.getAll();
    }

    @Override
    @GetMapping("/{id}")
    public FlightEntity getById(@PathVariable(value = "id") long id) {
        return service.getById(id);
    }

    @Override
    @PutMapping("/")
    public void update(@RequestBody FlightEntity flight) {
        service.update(flight);
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
}
