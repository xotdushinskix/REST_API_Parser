package com.api.parser.service;

import com.api.parser.dao.AlbumDao;
import com.api.parser.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Created by nikita on 15.12.16.
 */
@Service
public class AlbumServiceImpl implements AlbumService{

    @Autowired
    private AlbumDao albumDao;


    public void addAlbum(Album album) throws SQLException {
        this.albumDao.addAlbum(album);
    }

}
