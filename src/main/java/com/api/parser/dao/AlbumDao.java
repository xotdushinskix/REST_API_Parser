package com.api.parser.dao;

import com.api.parser.model.Album;

import java.sql.SQLException;

/**
 * Created by nikita on 15.12.16.
 */
public interface AlbumDao {

    void addAlbum(Album album) throws SQLException;

}
