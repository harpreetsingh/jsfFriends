/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.harpreet.controller;


import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import org.harpreet.model.FriendEJB;
import org.harpreet.model.Friend;
/**
 *
 * @author harpreet
 */
@ManagedBean //(name="FriendController")
@RequestScoped
public class FriendController {

    @EJB
    private FriendEJB friendEJB;
    
    private Friend friend = new Friend ();
    private List<Friend> friendList = new ArrayList<Friend> (); 
    
    
    public String addFriend() {
        friendEJB.createFriend(friend);
        friendList = friendEJB.findFriends();
        return "newFriend.xhtml";
    }

    /**
     * @return the friend
     */
    public Friend getFriend() {
        return friend;
    }

    /**
     * @param friend the friend to set
     */
    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    /**
     * @return the friendList
     */
    public List<Friend> getFriendList() {
        return friendList;
    }

    /**
     * @param friendList the friendList to set
     */
    public void setFriendList(List<Friend> friendList) {
        this.friendList = friendList;
    }
}
