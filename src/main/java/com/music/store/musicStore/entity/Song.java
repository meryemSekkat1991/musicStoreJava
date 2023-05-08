package com.music.store.musicStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String kind;

    public Long getSongId() {
        return id;
    }

    public void setSongId(Long id) {
        this.id = id;
    }

    public String getSongName() {
        return name;
    }

    public void setSongName(String name) {
        this.name = name;
    }

    public String getSongKind() {
        return kind;
    }

    public void setSongKind(String kind) {
        this.kind = kind;
    }

}


