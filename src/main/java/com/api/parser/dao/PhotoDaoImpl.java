package com.api.parser.dao;

import com.api.parser.model.Photo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/**
 * Created by nikita on 15.12.16.
 */
@Repository
public class PhotoDaoImpl implements PhotoDao{

    @Autowired
    private SessionFactory sessionFactory;


    public void addPhoto(Photo photo) throws SQLException {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(photo);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }


}
