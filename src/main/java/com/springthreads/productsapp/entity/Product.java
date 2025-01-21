package com.springthreads.productsapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name="product")
@DynamicUpdate
@Getter
@Setter
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "wording", nullable = false)
	String wording;

	@Column(name = "description")
	String description;

	@Column(name = "category")
	int categoryId;

	@Column(name = "price", nullable = false)
	float price;

	@Column(name = "creation_date", nullable = false)
	@DateTimeFormat(pattern="yyy-mm-dd")
	LocalDate creationDate;

	@Column(name = "change_date", nullable = false)
	@DateTimeFormat(pattern="yyy-mm-dd")
	LocalDate changeDate;

	@Column(name = "picture")
	String picture;

}
