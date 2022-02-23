package az.coders.personalgrouplessonee.dao.service;

import az.coders.personalgrouplessonee.dao.entity.PersonEntity;

import java.util.List;


public interface PersonService extends Service<PersonEntity> {

    List<PersonEntity> getPersonFlight();

}
