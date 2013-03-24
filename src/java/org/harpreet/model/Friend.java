/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.harpreet.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author harpreet
 */
@Entity
@Table(name = "FRIENDS", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Friend.findAll", query = "SELECT f FROM Friend f")})//,
//    @NamedQuery(name = "Friends.findById", query = "SELECT f FROM Friends f WHERE f.id = :id"),
//    @NamedQuery(name = "Friends.findByName", query = "SELECT f FROM Friends f WHERE f.name = :name"),
//    @NamedQuery(name = "Friends.findByHasfriend", query = "SELECT f FROM Friends f WHERE f.hasfriend = :hasfriend")})
public class Friend implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "HASFRIEND")
    private String hasFriend;

    public Friend() {
    }

    public Friend(Integer id) {
        this.id = id;
    }

    public Friend(Integer id, String name, String hasfriend) {
        this.id = id;
        this.name = name;
        this.hasFriend = hasfriend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHasFriend() {
        return hasFriend;
    }

    public void setHasFriend(String hasFriend) {
        this.hasFriend = hasFriend;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Friend)) {
            return false;
        }
        Friend other = (Friend) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.harpreet.jpa.Friends[ id=" + id + " ]";
    }
    
}
