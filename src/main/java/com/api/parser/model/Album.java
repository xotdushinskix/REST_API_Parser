package com.api.parser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by nikita on 15.12.16.
 */
@Entity
@Table(name = "album")
public class Album {

    @Id
    @Column(name = "albumId")
    private int albumId;

    public Album() {

    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
}
