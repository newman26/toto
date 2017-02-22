package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="todos")
public class Todo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String sammary;
	private String description;

	public Todo() {
		super();
	}

	public Todo(String sammary, String description) {
		super();
		this.sammary = sammary;
		this.description = description;
	}

	public Todo(int id, String sammary, String description) {
		super();
		this.id = id;
		this.sammary = sammary;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSammary() {
		return sammary;
	}

	public void setSammary(String sammary) {
		this.sammary = sammary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", sammary=" + sammary + ", description="
				+ description + "]";
	}

}
