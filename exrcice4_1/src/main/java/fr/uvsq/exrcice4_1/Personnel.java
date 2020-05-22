package fr.uvsq.exrcice4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Personnel implements InterfacePersonnel {
	private int id;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String fonction = null;
	List<Integer> tels = new ArrayList<Integer>();

	public Personnel(Builder builder) {
		this.id = builder.id;
		this.setNom(builder.nom);
		this.setPrenom(builder.prenom);
		this.setDateNaissance(builder.dateNaissance);

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("id personnel:" + id);

	}

	public static class Builder {
		private int id;
		private String nom;
		private String prenom;
		private LocalDate dateNaissance;
		private String fonction;
		List<Integer> tels = new ArrayList<Integer>();

		public List<Integer> getTels() {
			return tels;
		}

		public void setTels(List<Integer> tels) {
			this.tels = tels;
		}

		public Builder(int id, String nom, String prenom, LocalDate dateNaissance) {
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
		}

		

		public Builder addFonction(String fn) {

			this.setFonction(fn);
			return this;
		}

		public Builder addNumeroTelephone(Integer numero) {
			this.tels.add(numero);

			return this;

		}

		public Personnel build() {
			return new Personnel(this);
		}

		public String getFonction() {
			return fonction;
		}

		public void setFonction(String fonction) {
			this.fonction = fonction;
		}

	}

	public String toString() {

		return " Personnel id : " + this.id;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
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

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

}
