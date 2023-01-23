package com.cricket.cricket;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CricketRepository implements IntCricket<Player> {

    private Map<Long,Player> repository;

    public CricketRepository(){
        repository = new HashMap<>();

    };

    @Override
    public void save(Player player) {
        repository.put(player.getId(), player);
        
    }

    @Override
    public Collection<Player> viewAll() {
        return repository.values();
    }

    

    @Override
    public void update(Player player) {
        repository.put(player.getId(), player);
        
    }

    @Override
    public void delete(Player player) {
        repository.remove(player.getId());
        
    }

    @Override
    public Player viewById(Long id) {
        return repository.get(id);
    }
    
}
