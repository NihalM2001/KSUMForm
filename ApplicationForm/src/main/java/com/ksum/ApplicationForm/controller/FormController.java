package com.ksum.ApplicationForm.controller;

import java.sql.Blob;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.ksum.ApplicationForm.model.FormModel;
import com.ksum.ApplicationForm.service.FormService;



@Controller
public class FormController {

    @Autowired
    FormService formSer;

    @PostMapping("/saveForm")
    public String saveForm(@ModelAttribute FormModel fm) {
        formSer.saveForm(fm);
        return "redirect:/form";
    }
    
    @GetMapping("/form")
    public String ShowForm() {
        return "form";
    }

    
    // @PostMapping("/saveForm")
    // public String saveForm(@ModelAttribute FormModel fm) {
    //     MultipartFile file = fm.getResume();

    //     if (!file.isEmpty()) {
    //         byte[] fileBytes = file.getBytes();
    //         Blob blob = new SerialBlob(fileBytes);

    //         // Now set this blob to your entity before saving to DB
            
    //         FormModel entity = new FormModel();
    //         // entity.setResume(blob);
    //         formSer.saveForm(entity);
    //     }
        
    // }
}
