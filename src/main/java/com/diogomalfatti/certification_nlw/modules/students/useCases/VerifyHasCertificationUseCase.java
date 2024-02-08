package com.diogomalfatti.certification_nlw.modules.students.useCases;

import com.diogomalfatti.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.diogomalfatti.certification_nlw.modules.students.repositories.CertificationStudentEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyHasCertificationUseCase {

    @Autowired
    private CertificationStudentEntityRepository certificationStudentEntityRepository;

    public boolean execute(VerifyHasCertificationDTO dto) {

        var result = this.certificationStudentEntityRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());

        if(!result.isEmpty()) {
            return true;
        }
        return false;
    }
}
