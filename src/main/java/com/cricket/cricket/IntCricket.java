package com.cricket.cricket;

import java.util.Collection;

public interface IntCricket<T> {

    public void save(T t);

    public Collection<T> viewAll();

    public void update(T t);

    public void delete(T t);

    public Player viewById(Long id);
    
}
