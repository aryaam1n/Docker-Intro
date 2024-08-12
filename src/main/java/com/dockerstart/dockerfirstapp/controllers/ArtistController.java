package com.dockerstart.dockerfirstapp.controllers;

import com.dockerstart.dockerfirstapp.models.Artist;
import com.dockerstart.dockerfirstapp.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping("/artists")
    public ArrayList<Artist> getAllArtists(){
        return artistService.getAllArtists();
    }

    @GetMapping("/{name}/email")
    public String getArtistEmail(@PathVariable String name){
        return artistService.getEmail(name);
    }

}
