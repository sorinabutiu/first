package com.example.vaccine.project.repository;

import com.example.vaccine.project.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

    Patient findByAge(Integer age);

    @Modifying
    @Query("Update Patient v SET v.isMarried = :isMarried, v.isVaccinated = :isVaccinated WHERE v.id = :id")
    void updatePatientisMarriedAndVaccinated (boolean isMarried, boolean isVaccinated, int id);
}
