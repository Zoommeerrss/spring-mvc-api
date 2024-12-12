package com.javatpoint.adapter.entity;

import lombok.*;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
@ToString
public class Person implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3941860187751153049L;

	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "person_id", nullable = false, updatable = false)
    private String personId;

    @Column(name = "person_name", nullable = false)
    private String name;

    @Column(name = "person_year", nullable = false)
    private Integer year;

    @Column(name = "person_age", nullable = false)
    private Integer age;
}
