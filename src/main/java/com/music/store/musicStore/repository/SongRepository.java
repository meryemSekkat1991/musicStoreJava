package com.music.store.musicStore.repository;

import org.springframework.data.repository.CrudRepository;
import com.music.store.musicStore.entity.Song;

public interface SongRepository extends CrudRepository<Song, Long> {
    
}
