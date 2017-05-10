package com.sinergia.springbatch.test.domain;


/**
 * @generated
 */
public class History implements java.io.Serializable {
	/**
	 * @generated
	 */
	private String code;
	/**
	 * @generated
	 */
	private String photo;
	/**
	 * @generated
	 */
	private static final long serialVersionUID = 1174474238L;

	/**
	 * @generated
	 */
	private java.util.List<Medicine> medicines = new java.util.ArrayList<Medicine>();

	/**
	 * @generated
	 */
	private MedicalHistory medicalHistory;

	/**
	 * @generated
	 */
	public History() {
	}

	/**
	 * @generated
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * @generated
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @generated
	 */
	public String getPhoto() {
		return this.photo;
	}

	/**
	 * @generated
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "History" + " code=" + code + " photo=" + photo;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final History other = (History) obj;
		org.apache.commons.lang.builder.EqualsBuilder builder = new org.apache.commons.lang.builder.EqualsBuilder();
		builder.append(code, other.code);
		builder.append(photo, other.photo);
		builder.append(medicines, other.medicines);
		builder.append(medicalHistory, other.medicalHistory);
		return builder.isEquals();
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		org.apache.commons.lang.builder.HashCodeBuilder builder = new org.apache.commons.lang.builder.HashCodeBuilder();
		builder.append(code);
		builder.append(photo);
		builder.append(medicines);
		builder.append(medicalHistory);
		return builder.toHashCode();
	}

	/**
	 * @generated
	 */
	public java.util.List<Medicine> getMedicines() {
		return this.medicines;
	}

	/**
	 * @generated
	 */
	public void setMedicines(java.util.List<Medicine> medicines) {
		this.medicines = medicines;
	}

	/**
	 * @generated
	 */
	public void addMedicines(Medicine medicines) {
		getMedicines().add(medicines);
		medicines.setHistory(this);
	}

	/**
	 * @generated
	 */
	public void removeMedicines(Medicine medicines) {
		getMedicines().remove(medicines);
		medicines.setHistory(null);
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