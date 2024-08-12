package com.dockerstart.dockerfirstapp.services;

import com.dockerstart.dockerfirstapp.repositories.ArtistRepo;
import com.dockerstart.dockerfirstapp.models.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepo artistRepo;

    public ArrayList<Artist> getAllArtists(){
        ArrayList<Artist> artists = new ArrayList<>();
        artistRepo.findAll().forEach(artists::add);
        return artists;
    }

    public String getEmail(String name){
        String email = "";

        ArrayList<Artist> artists = new ArrayList<>();
        artistRepo.findAll().forEach(artists::add);
        for (Artist i : artists){
            if (i.getName().toLowerCase().equals(name)){
                email = i.getEmail();
            }
        }
        return email;
    }



}
