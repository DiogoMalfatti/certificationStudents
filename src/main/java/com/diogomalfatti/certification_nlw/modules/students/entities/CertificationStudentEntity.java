package com.diogomalfatti.certification_nlw.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CertificationStudentEntity {

    private UUID id;
    private UUID studentID;
    private String technology;
    private int grate;
    List<AnswersCertificationsEntity> answersCertificationsEntities;
}
