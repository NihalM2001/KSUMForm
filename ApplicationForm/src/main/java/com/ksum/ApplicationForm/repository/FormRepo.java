package com.ksum.ApplicationForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksum.ApplicationForm.model.FormModel;

public interface FormRepo extends JpaRepository<FormModel,Integer>{

}
