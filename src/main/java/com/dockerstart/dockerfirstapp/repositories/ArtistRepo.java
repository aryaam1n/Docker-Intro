package com.dockerstart.dockerfirstapp.repositories;

import com.dockerstart.dockerfirstapp.models.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepo extends CrudRepository<Artist, Long> {
}
