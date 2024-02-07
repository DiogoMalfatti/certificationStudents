package com.diogomalfatti.certification_nlw.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentEntity {

    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntityList;
}
