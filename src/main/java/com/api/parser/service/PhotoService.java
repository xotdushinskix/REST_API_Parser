package com.api.parser.service;

import com.api.parser.model.Photo;

import java.sql.SQLException;

/**
 * Created by nikita on 15.12.16.
 */
public interface PhotoService {

    void addPhoto(Photo photo) throws SQLException;

}
