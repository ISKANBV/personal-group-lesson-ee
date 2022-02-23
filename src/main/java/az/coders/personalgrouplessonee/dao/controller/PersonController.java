package az.coders.personalgrouplessonee.dao.controller;

import az.coders.personalgrouplessonee.dao.entity.PersonEntity;

import java.util.List;

public interface PersonController extends Controller<PersonEntity>{

    List<PersonEntity> getPersonFlight();
}
