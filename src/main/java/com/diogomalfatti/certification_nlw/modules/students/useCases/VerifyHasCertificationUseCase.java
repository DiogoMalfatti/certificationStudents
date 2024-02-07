package com.diogomalfatti.certification_nlw.modules.students.useCases;

import com.diogomalfatti.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if(dto.getEmail().equals("diimalfatti@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}
