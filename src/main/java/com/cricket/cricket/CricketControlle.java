package com.cricket.cricket;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Players")
public class CricketControlle {

    CricketRepository repo;

    public CricketControlle() {
        repo = new CricketRepository();
    }

    @GetMapping("/all")
    public String getAll(){
        return "hey";
    }

    @GetMapping("")
    public Collection<Player> viewAll(){
        return repo.viewAll();
    }

    @GetMapping("/{id}")
    public Player viewByID(@PathVariable Long id){
        return repo.viewById(id);
    }

    @PostMapping("")
    public String saveplayer(@RequestBody Player player){
        repo.save(player);
        return "Player has been added "+ player.getName();
    }

    @PutMapping("")
    public String updatePlayer(@RequestBody Player player){
        repo.update(player);
        return "Player has been Updated " + player.getName();
    } 
    @DeleteMapping("")
    public String deletePlayer(@RequestBody Player player){
        repo.delete(player);
        return "Player has been Delete " + player.getName();
    } 
    

}
