package com.sinergia.springbatch.test.domain;


/**
 * @generated
 */
@javax.persistence.Entity
public class Person implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1510120619L;
	/**
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.GeneratedValue
	private Long id;
	/**
	 * @generated
	 */
	private String names;
	/**
	 * @generated
	 */
	private String surnames;

	/**
	 * @generated
	 */
	@javax.persistence.ManyToOne
	private MedicalHistory medicalHistory;

	/**
	 * @generated
	 */
	public Person() {
	}

	/**
	 * @generated
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * @generated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @generated
	 */
	public String getNames() {
		return this.names;
	}

	/**
	 * @generated
	 */
	public void setNames(String names) {
		this.names = names;
	}

	/**
	 * @generated
	 */
	public String getSurnames() {
		return this.surnames;
	}

	/**
	 * @generated
	 */
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Person" + " id=" + id + " names=" + names + " surnames="
				+ surnames;
	}

	/**
	 * @generated
	 */
	public MedicalHistory getMedicalHistory() {
		return this.medicalHistory;
	}

	/**
	 * @generated
	 */
	public void setMedicalHistory(MedicalHistory medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
}