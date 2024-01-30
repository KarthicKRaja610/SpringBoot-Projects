package com.institutemanagementsystem.institutemanagementsystemapi.controllers;

import com.institutemanagementsystem.institutemanagementsystemapi.DTO.InstituteDTO;
import com.institutemanagementsystem.institutemanagementsystemapi.services.InstutiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/instituteManagement/v1")
public class InstituteController {

    @Autowired
    private InstutiteService instutiteService;
    @GetMapping("getInstituteDetails/{id}")
    public ResponseEntity getInstituteDetails(@PathVariable(name = "id") int id){
        return instutiteService.getInstituteDetails(id);
    }

    @PutMapping("setInstituteDetailsById/{id}")
    public ResponseEntity setInstituteDetailsById(@PathVariable(name = "id") int id, @RequestBody InstituteDTO instituteDTO){
        return instutiteService.setInstituteDetailsById(id, instituteDTO);
    }

    @PostMapping("setInstituteDetails")
    public ResponseEntity setInstituteDetailsById(@RequestBody InstituteDTO instituteDTO){
        return instutiteService.setInstituteDetails(instituteDTO);
    }
}
