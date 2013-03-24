/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.harpreet.model;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author harpreet
 */
@Stateless
public class FriendEJB {

    @PersistenceContext(unitName="jsfHelloPU")
    
    private EntityManager em;
    public Friend createFriend(Friend friend) {
        em.persist(friend);
        return friend;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List<Friend> findFriends() {
        Query query = em.createNamedQuery("Friend.findAll");
        return query.getResultList();
    }
    
}
