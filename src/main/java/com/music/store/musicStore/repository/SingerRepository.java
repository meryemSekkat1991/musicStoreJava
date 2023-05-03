package com.music.store.musicStore.repository;

import com.music.store.musicStore.entity.Singer;
import org.springframework.data.repository.CrudRepository;

public interface SingerRepository extends CrudRepository<Singer, Long> {
}
