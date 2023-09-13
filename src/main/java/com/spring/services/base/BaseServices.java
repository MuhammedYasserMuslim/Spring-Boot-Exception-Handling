package com.spring.services.base;

import java.util.List;
import java.util.Optional;

public interface BaseServices<T, ID> {


    public Long count();


    public List<T> findAll();

    public Optional<T> findById(ID id);

    public void insert(T t);

    public void update(T t);

    public void deleteById(ID id);


}
