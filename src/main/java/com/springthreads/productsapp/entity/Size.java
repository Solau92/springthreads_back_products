package com.springthreads.productsapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name="size")
@DynamicUpdate
@Getter
@Setter
@NoArgsConstructor
public class Size {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "wording", nullable = false)
	String wording;

	@Column(name = "description")
	String description;

	@Column(name = "creation_date", nullable = false)
	@DateTimeFormat(pattern="yyy-mm-dd")
	LocalDate creationDate;

	@Column(name = "change_date", nullable = false)
	@DateTimeFormat(pattern="yyy-mm-dd")
	LocalDate changeDate;

}
