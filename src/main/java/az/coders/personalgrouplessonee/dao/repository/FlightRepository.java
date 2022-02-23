package az.coders.personalgrouplessonee.dao.repository;

import az.coders.personalgrouplessonee.dao.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<FlightEntity,Long> {
}
