package az.coders.personalgrouplessonee.dao.controller;

import java.util.List;

public interface Controller<T> {

    void add(T object);

    List<T> getAll();

    T getById(long id);

    void update(T object);

    void delete(long id);

    void deleteAll();
}
