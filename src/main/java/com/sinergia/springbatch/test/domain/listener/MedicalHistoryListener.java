package com.sinergia.springbatch.test.domain.listener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.google.gson.Gson;
import com.sinergia.springbatch.test.domain.History;
import com.sinergia.springbatch.test.domain.MedicalHistory;
public class MedicalHistoryListener {
	@PrePersist
	public void userPrePersist(MedicalHistory medicalHistory) {
		Gson gson = new Gson();
		
		History history = medicalHistory.getHistory();
		String jsonInString = gson.toJson(history);
		medicalHistory.setData(jsonInString);
		
		System.out.println("Listening MedicalHistory Pre Persist : " + medicalHistory.getData());
	}
	@PostPersist
	public void userPostPersist(MedicalHistory ob) {
		System.out.println("Listening MedicalHistory Post Persist : " + ob.getData());
	}
	@PostLoad
	public void userPostLoad(MedicalHistory ob) {
		System.out.println("Listening MedicalHistory Post Load : " + ob.getData());
	}	
	@PreUpdate
	public void userPreUpdate(MedicalHistory ob) {
		System.out.println("Listening MedicalHistory Pre Update : " + ob.getData());
	}
	@PostUpdate
	public void userPostUpdate(MedicalHistory ob) {
		System.out.println("Listening MedicalHistory Post Update : " + ob.getData());
	}
	@PreRemove
	public void userPreRemove(MedicalHistory ob) {
		System.out.println("Listening MedicalHistory Pre Remove : " + ob.getData());
	}
	@PostRemove
	public void userPostRemove(MedicalHistory ob) {
		System.out.println("Listening MedicalHistory Post Remove : " + ob.getData());
	}
} 