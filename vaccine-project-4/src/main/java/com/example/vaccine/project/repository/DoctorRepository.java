package com.example.vaccine.project.repository;

import com.example.vaccine.project.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

    Doctor findByLastName(String lastName);

    @Modifying
    @Query("Update Doctor v SET v.eMail = :eMail WHERE v.id = :id")
    void updateDoctorType(String eMail, int id);
}
