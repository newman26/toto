/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author INTI0261
 */

@Entity
@Table(name="utilisateurs")
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    
	@Column(name="dn")
	@Temporal(TemporalType.DATE)
	private Date date;
	
    private String mail;
    private String password;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="agent_id",referencedColumnName="id")
    private Agent agent;
    
    
    /**
     * ctors
     */
    public Utilisateur() {
    }

    
    
    public Utilisateur(String nom, String prenom,Date date, String mail, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date=date;
		this.mail = mail;
		this.password = password;
	}



	public Utilisateur(int id, String nom, String prenom,Date date, String mail, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    	this.date=date;
        this.mail = mail;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



	public Agent getAgent() {
		return agent;
	}



	public void setAgent(Agent agent) {
		this.agent = agent;
	}



	@Override
	public String toString() {
		return "Utilisateur [ nom=" + nom + ", prenom=" + prenom +", date="+ date +", mail=" + mail + ", password="
				+ password + "]";
	}
    
    
    

}
