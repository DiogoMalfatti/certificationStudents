package com.diogomalfatti.certification_nlw.modules.students.controllers;

import com.diogomalfatti.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.diogomalfatti.certification_nlw.modules.students.useCases.VerifyHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    // preciso usar o meu USECASE
    @Autowired
    private VerifyHasCertificationUseCase verifyHasCertificationUseCase;
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        // Email
        // Tech
        var result = this.verifyHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if (result) {
            return "Usuario ja fez a prova";
        }
        return "Usuario pode fazer a prova";
    }
}
