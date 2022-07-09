package com.demo.entities;// default package
// Generated Jul 8, 2022, 10:40:31 PM by Hibernate Tools 4.3.5.Final

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
 * Rate generated by hbm2java
 */
@Entity
@Table(name = "rate", catalog = "booking")
public class Rate implements java.io.Serializable {

	private Integer id;
	private Integer point;
	private Set<Review> reviews = new HashSet<Review>(0);

	public Rate() {
	}

	public Rate(Integer point, Set<Review> reviews) {
		this.point = point;
		this.reviews = reviews;
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

	@Column(name = "POINT")
	public Integer getPoint() {
		return this.point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rate")
	public Set<Review> getReviews() {
		return this.reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

}
