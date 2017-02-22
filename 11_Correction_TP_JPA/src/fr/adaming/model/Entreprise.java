package fr.adaming.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="entreprise")
public class Entreprise {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	@OneToMany
	private List<Employe> listeEmployes;

	public Entreprise() {
		super();
	}

	public Entreprise(String nom) {
		super();
		this.nom = nom;
	}

	public Entreprise(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
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

	public List<Employe> getListeEmployes() {
		return listeEmployes;
	}

	public void setListeEmployes(List<Employe> listeEmployes) {
		this.listeEmployes = listeEmployes;
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", nom=" + nom + ", listeEmployes="
				+ listeEmployes + "]";
	}

}
