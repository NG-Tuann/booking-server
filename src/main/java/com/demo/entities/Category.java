package com.demo.entities;// default package
// Generated Jul 13, 2022, 9:23:11 AM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "booking")
public class Category implements java.io.Serializable {

	private Integer id;
	private String name;
	private boolean status;
	private String image;
	private Set<Accomodation> accomodations = new HashSet<Accomodation>(0);

	
	public Category() {
	}

	public Category(boolean status) {
		this.status = status;
	}

	public Category(String name, boolean status,String image, Set<Accomodation> accomodations) {
		this.name = name;
		this.status = status;
		this.accomodations = accomodations;
		this.image = image;
	}
	@Column(name = "IMAGE", length = 100)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	public Category(String name, boolean status, Set<Accomodation> accomodations, String image) {
		this.name = name;
		this.status = status;
		this.accomodations = accomodations;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NAME", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "STATUS", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Accomodation> getAccomodations() {
		return this.accomodations;
	}

	public void setAccomodations(Set<Accomodation> accomodations) {
		this.accomodations = accomodations;
	}




}
