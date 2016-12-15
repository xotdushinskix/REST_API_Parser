package com.api.parser.dao;

import com.api.parser.model.Album;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/**
 * Created by nikita on 15.12.16.
 */
@Repository
public class AlbumDaoImpl implements AlbumDao {

    @Autowired
    private SessionFactory sessionFactory;


    public void addAlbum(Album album) throws SQLException {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(album);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null)) {
                session.close();
            }
        }
    }


}
