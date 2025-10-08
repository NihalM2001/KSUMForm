package com.ksum.ApplicationForm.model;

import java.sql.Blob;
import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FormModel {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String email;
    private String phone;
    private String gender;
    private LocalDate dateOfBirth;
    private String bio;
    private MultipartFile resume;
}
