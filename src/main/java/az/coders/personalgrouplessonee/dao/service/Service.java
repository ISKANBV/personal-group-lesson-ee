package az.coders.personalgrouplessonee.dao.service;

import az.coders.personalgrouplessonee.dao.entity.PersonEntity;

import java.util.List;

public interface Service<T> {

    void add(T object);

    List<T> getAll();

    T getById(long id);

    void update(T object);

    void delete(long id);

    void deleteAll();
}
