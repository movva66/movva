package com.spring.lombok.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Producttt {
//hiiii
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double price;
	
}
