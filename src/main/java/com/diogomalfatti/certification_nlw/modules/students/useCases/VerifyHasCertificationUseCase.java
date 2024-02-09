package com.diogomalfatti.certification_nlw.modules.students.useCases;

import com.diogomalfatti.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.diogomalfatti.certification_nlw.modules.students.repositories.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyHasCertificationUseCase {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute(VerifyHasCertificationDTO dto) {

        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(
                dto.getEmail(), dto.getTechnology());

        if(!result.isEmpty()) {
            return true;
        }
        return false;
    }
}
