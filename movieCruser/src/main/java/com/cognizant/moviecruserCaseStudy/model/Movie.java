package com.cognizant.moviecruserCaseStudy.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mo_id")
	private Integer id;

	@Column(name = "mo_title")
	private String title;

	@Column(name = "mo_box_office")
	private String boxOffice;

	@Column(name = "mo_active")
	private boolean active;

	@Column(name = "mo_date_of_launch")
	private Date dateOfLaunch;

	@Column(name = "mo_genre")
	private String genre;

	@Column(name = "mo_has_teaser")
	private boolean hasTeaser;

	
	public Movie()
	{
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean getHasTeaser() {
		return hasTeaser;
	}

	public void setHasTeaser(boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (id ^ (id >>> 32));
		return result;
	}
	
	@Override
	public String toString() {
		return "\nId = " + id + "\nTitle = " + title + "\nBox Office = " + boxOffice + "\nActive = " + active
				+ "\nDate Of Launch = " + dateOfLaunch + "\nGenre = " + genre + "\nHas Teaser = " + hasTeaser
				+ "\n***************************************\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (id != other.id)
			return false;
		return true;
	}

}