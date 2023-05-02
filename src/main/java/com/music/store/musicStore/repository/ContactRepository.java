package com.music.store.musicStore.repository;

import com.music.store.musicStore.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
