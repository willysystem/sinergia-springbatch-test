package com.sinergia.springbatch.test.domain;

import javax.persistence.EntityListeners;
import javax.persistence.Transient;

import com.sinergia.springbatch.test.domain.listener.MedicalHistoryListener;


/**
 * @generated
 */
@javax.persistence.Entity
@EntityListeners({MedicalHistoryListener.class})
public class MedicalHistory implements java.io.Serializable {
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -2052466663L;
	/**
	 * @generated
	 */
	@javax.persistence.Id
	@javax.persistence.GeneratedValue
	private Long id;

	/**
	 * @generated
	 */
	@javax.persistence.Column(length = 10485760)
	private String data;

	/**
	 * @generated
	 */
	@javax.persistence.OneToMany(mappedBy = "medicalHistory")
	private java.util.Set<Person> persons = new java.util.HashSet<Person>();

	/**
	 * @generated
	 */
	private java.util.Date initDate;

	/**
	 * @generated
	 */
	@javax.persistence.OneToOne(mappedBy = "medicalHistory")
	@Transient
	private History history;

	/**
	 * @generated
	 */
	public String toString() {
		return "MedicalHistory" + " id=" + id + " data=" + data + " initDate="
				+ initDate;
	}

	/**
	 * @generated
	 */
	public MedicalHistory() {
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
	public String getData() {
		return this.data;
	}

	/**
	 * @generated
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @generated
	 */
	public java.util.Set<Person> getPersons() {
		return this.persons;
	}

	/**
	 * @generated
	 */
	public void setPersons(java.util.Set<Person> persons) {
		this.persons = persons;
	}

	/**
	 * @generated
	 */
	public void addPersons(Person persons) {
		getPersons().add(persons);
		persons.setMedicalHistory(this);
	}

	/**
	 * @generated
	 */
	public void removePersons(Person persons) {
		getPersons().remove(persons);
		persons.setMedicalHistory(null);
	}

	/**
	 * @generated
	 */
	public java.util.Date getInitDate() {
		return this.initDate;
	}

	/**
	 * @generated
	 */
	public void setInitDate(java.util.Date initDate) {
		this.initDate = initDate;
	}

	/**
	 * @generated
	 */
	public History getHistory() {
		return this.history;
	}

	/**
	 * @generated
	 */
	public void setHistory(History history) {
		this.history = history;
	}
}