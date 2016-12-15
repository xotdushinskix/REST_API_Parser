package com.api.parser.service;

import com.api.parser.dao.PhotoDao;
import com.api.parser.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Created by nikita on 15.12.16.
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoDao photoDao;


    public void addPhoto(Photo photo) throws SQLException {
        this.photoDao.addPhoto(photo);
    }
}
