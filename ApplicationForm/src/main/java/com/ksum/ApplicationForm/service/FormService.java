package com.ksum.ApplicationForm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksum.ApplicationForm.model.FormModel;
import com.ksum.ApplicationForm.repository.FormRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class FormService {
    @Autowired
    FormRepo formRepo;

    public FormModel saveForm(FormModel fm)
    {
        return formRepo.save(fm);
    }
}
