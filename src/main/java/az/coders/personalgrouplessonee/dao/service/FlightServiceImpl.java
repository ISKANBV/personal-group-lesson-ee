package az.coders.personalgrouplessonee.dao.service;

import az.coders.personalgrouplessonee.dao.entity.FlightEntity;
import az.coders.personalgrouplessonee.dao.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService{

    private final FlightRepository repository;

    public FlightServiceImpl(FlightRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(FlightEntity object) {
        repository.save(object);
    }

    @Override
    public List<FlightEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public FlightEntity getById(long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("id not founded"));
    }

    @Override
    public void update(FlightEntity object) {
        FlightEntity flight = getById(object.getId());
        flight.setTicketNo(object.getTicketNo());
        flight.setTicketPrice(object.getTicketPrice());
        flight.setTicketDestination(object.getTicketDestination());
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
