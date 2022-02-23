package az.coders.personalgrouplessonee.dao.repository;

import az.coders.personalgrouplessonee.dao.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,Long> {

    @Query(value = "select person.name,flights.id" +
            " from person" +
            " left join flights" +
            " on person.flight_id = flights.id",
            nativeQuery = true)
    List<PersonEntity> getPersonFlight();
}
