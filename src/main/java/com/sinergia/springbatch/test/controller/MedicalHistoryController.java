package com.sinergia.springbatch.test.controller;

import com.sinergia.springbatch.test.domain.History;
import com.sinergia.springbatch.test.domain.MedicalHistory;
import com.sinergia.springbatch.test.domain.Medicine;
import com.sinergia.springbatch.test.repository.MedicalHistoryDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class UserController
 */
@RestController
public class MedicalHistoryController {

  // ------------------------
  // PUBLIC METHODS
  // ------------------------

  /**
   * Create a new user with an auto-generated id and email and name as passed 
   * values.
   */
  @RequestMapping(value="/create")
  @ResponseBody
  public String create(String email, String name) {
    try {
      MedicalHistory medicalHistory = new MedicalHistory();
      medicalHistory.setInitDate(new Date());
      
      List<Medicine> medicines = new ArrayList<>();
      Medicine m = new Medicine();
      m.setName("Amox");
      medicines.add(m);
      
      History history = new History();
      history.setCode("12121212");
      history.setMedicines(medicines);
      medicalHistory.setHistory(history);
      //medicalHistory.setData("{name:'willy'}");
      userDao.create(medicalHistory);
    }
    catch (Exception ex) {
      return "Error creating the user: " + ex.toString();
    }
    return "MedicalHistory succesfully created!";
  }
  
  /**
   * Delete the user with the passed id.
   */
  @RequestMapping(value="/delete")
  @ResponseBody
  public String delete(long id) {
    try {
      MedicalHistory user = new MedicalHistory();
      user.setId(id);
      userDao.delete(user);
    }
    catch (Exception ex) {
      return "Error deleting the user: " + ex.toString();
    }
    return "MedicalHistory succesfully deleted!";
  }
  
  /**
   * Retrieve the id for the user with the passed email address.
   */
  @RequestMapping(value="/get-by-id")
  @ResponseBody
  public MedicalHistory getById(String id) {
//    String userId;
    MedicalHistory user;
    try {
      user = userDao.getById(8L); //getByEmail(email);
      //userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return null;
    }
    return user;
  }
  
  /**
   * Update the email and the name for the user indentified by the passed id.
   */
  @RequestMapping(value="/update")
  @ResponseBody
  public String updateName(long id, String email, String name) {
    try {
      MedicalHistory user = userDao.getById(id);
      user.setInitDate(new Date());
      user.setData("{name='Juan'}");
      userDao.update(user);
    }
    catch (Exception ex) {
      return "Error updating the user: " + ex.toString();
    }
    return "MedicalHistory succesfully updated!";
  } 

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // Wire the MedicalHistoryDao used inside this controller.
  @Autowired
  private MedicalHistoryDao userDao;
  
} // class UserController