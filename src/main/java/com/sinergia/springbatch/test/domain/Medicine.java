package com.sinergia.springbatch.test.domain;


/**
 * @generated
 */
public class Medicine implements java.io.Serializable {
	/**
	 * @generated
	 */
	private String name;
	/**
	 * @generated
	 */
	private static final long serialVersionUID = -1816897008L;

	/**
	 * @generated
	 */
	private History history;

	/**
	 * @generated
	 */
	public Medicine() {
	}

	/**
	 * @generated
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @generated
	 */
	public String toString() {
		return "Medicine" + " name=" + name;
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
		final Medicine other = (Medicine) obj;
		org.apache.commons.lang.builder.EqualsBuilder builder = new org.apache.commons.lang.builder.EqualsBuilder();
		builder.append(name, other.name);
		builder.append(history, other.history);
		return builder.isEquals();
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		org.apache.commons.lang.builder.HashCodeBuilder builder = new org.apache.commons.lang.builder.HashCodeBuilder();
		builder.append(name);
		builder.append(history);
		return builder.toHashCode();
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