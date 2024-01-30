package com.institutemanagementsystem.institutemanagementsystemapi.respositories;

import com.institutemanagementsystem.institutemanagementsystemapi.models.InstituteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituteRepository extends JpaRepository<InstituteModel, Integer> {

}
