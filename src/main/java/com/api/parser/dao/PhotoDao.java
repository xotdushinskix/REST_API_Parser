package com.api.parser.dao;

import com.api.parser.model.Photo;

import java.sql.SQLException;

/**
 * Created by nikita on 15.12.16.
 */
public interface PhotoDao {

    void addPhoto(Photo photo) throws SQLException;

}
