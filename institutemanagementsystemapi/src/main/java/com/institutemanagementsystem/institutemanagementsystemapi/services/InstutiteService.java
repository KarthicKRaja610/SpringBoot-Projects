package com.institutemanagementsystem.institutemanagementsystemapi.services;

import com.institutemanagementsystem.institutemanagementsystemapi.DTO.InstituteDTO;
import com.institutemanagementsystem.institutemanagementsystemapi.models.InstituteModel;
import com.institutemanagementsystem.institutemanagementsystemapi.respositories.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InstutiteService {

    @Autowired
    private InstituteRepository instituteRepository;

    public ResponseEntity getInstituteDetails(int id) {
        Optional<InstituteModel> instituteModel = instituteRepository.findById(id);
        boolean nilCheck = instituteModel.isPresent();
        if(nilCheck){
            return ResponseEntity.ok(instituteModel.get());
        }
        else {
            return ResponseEntity.badRequest().body("We are not able to find the data's for the given id "+id);
        }

    }

    public ResponseEntity setInstituteDetailsById(int id, InstituteDTO instituteDTO) {
        Optional<InstituteModel> instituteModelOptional = instituteRepository.findById(id);
        boolean nilCheck = instituteModelOptional.isPresent();

        if(nilCheck){
            InstituteModel instituteModel = instituteModelOptional.get();
            instituteModel.setName(instituteDTO.getName());
            instituteModel.setLocation(instituteDTO.getLocation());
            instituteModel.setContactInformation(instituteDTO.getContactInformation());
            instituteRepository.save(instituteModel);
            return ResponseEntity.ok("Data's are updated for the given id "+id);
        }
        else {
            return ResponseEntity.badRequest().body("We are not able to find the data's for the given id "+id);
        }
    }

    public ResponseEntity setInstituteDetails(InstituteDTO instituteDTO) {
        int id = instituteDTO.getId();
        Optional<InstituteModel> instituteModelOptional = instituteRepository.findById(id);
        boolean nilCheck = instituteModelOptional.isPresent();
        if (!nilCheck){
            InstituteModel instituteModel = new InstituteModel();
            instituteModel.setName(instituteDTO.getName());
            instituteModel.setLocation(instituteDTO.getLocation());
            instituteModel.setContactInformation(instituteDTO.getContactInformation());
            instituteModel.setId(instituteDTO.getId());
            instituteModel.setFoundedYear(instituteDTO.getFoundedYear());
            instituteRepository.save(instituteModel);
            return ResponseEntity.ok("Given data is successfully entered");
        }
        else {
            return ResponseEntity.badRequest().body("The Given Instution is already present in our database");
        }

    }
}
