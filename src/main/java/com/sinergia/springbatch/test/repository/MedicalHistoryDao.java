package com.sinergia.springbatch.test.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sinergia.springbatch.test.domain.MedicalHistory;

/**
 * This class is used to access data for the User entity. Repository annotation
 * allows the component scanning support to find and configure the DAO wihtout
 * any XML configuration and also provide the Spring exceptiom translation.
 * Since we've setup setPackagesToScan and transaction manager on
 * DatabaseConfig, any bean method annotated with Transactional will cause
 * Spring to magically call begin() and commit() at the start/end of the method.
 * If exception occurs it will also call rollback().
 */
@Repository
@Transactional
public class MedicalHistoryDao {

	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entityManager;

	// ------------------------
	// PUBLIC METHODS
	// ------------------------

	/**
	 * Save the user in the database.
	 */
	public void create(MedicalHistory medicalHistory) {
		entityManager.persist(medicalHistory);
		return;
	}

	/**
	 * Delete the user from the database.
	 */
	public void delete(MedicalHistory medicalHistory) {
		if (entityManager.contains(medicalHistory))
			entityManager.remove(medicalHistory);
		else
			entityManager.remove(entityManager.merge(medicalHistory));
		return;
	}

	/**
	 * Return all the users stored in the database.
	 */
	@SuppressWarnings("unchecked")
	public List<MedicalHistory> getAll() {
		return entityManager.createQuery("from User").getResultList();
	}

	/**
	 * Return the user having the passed email.
	 */
	public MedicalHistory getByEmail(String email) {
		return (MedicalHistory) entityManager.createQuery("from User where email = :email").setParameter("email", email)
				.getSingleResult();
	}

	/**
	 * Return the user having the passed id.
	 */
	public MedicalHistory getById(long id) {
		MedicalHistory  t = entityManager.find(MedicalHistory.class, id);
		return t;
	}

	/**
	 * Update the passed user in the database.
	 */
	public void update(MedicalHistory user) {
		entityManager.merge(user);
		return;
	}

} // class UserDao