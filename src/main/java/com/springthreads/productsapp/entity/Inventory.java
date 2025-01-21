package com.springthreads.productsapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name="inventory")
@DynamicUpdate
@Getter
@Setter
@NoArgsConstructor
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "sku", nullable = false)
	private String sku;

	@Column(name = "product_id", nullable = false)
	private int productId;

	@Column(name = "size_id", nullable = false)
	private int sizeId;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "creation_date", nullable = false)
	@DateTimeFormat(pattern="yyyy-mm-dd")
	LocalDate creationDate;

	@Column(name = "change_date", nullable = false)
	@DateTimeFormat(pattern="yyyy-mm-dd")
	LocalDate changeDate;
}
