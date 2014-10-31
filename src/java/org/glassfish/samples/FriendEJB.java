/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.glassfish.samples;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.glassfish.samples.model.Friend;

/**
 *
 * @author esinuda
 */
@Stateless
@Named
public class FriendEJB {

    @PersistenceContext
    EntityManager em;
    @Inject Friend friend;
    
    public List getList() {
        return em.createNamedQuery("Friend.findAll").getResultList();
    }
    
    public void create() {
        Friend f2 = new Friend(friend.getName(),friend.getAge());
        //em.persist(f2);
    }
}
