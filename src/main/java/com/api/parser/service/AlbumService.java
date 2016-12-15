package com.api.parser.service;

import com.api.parser.model.Album;

import java.sql.SQLException;

/**
 * Created by nikita on 15.12.16.
 */
public interface AlbumService {

    void addAlbum(Album album) throws SQLException;

}
