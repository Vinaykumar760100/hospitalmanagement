package com.hospitalmanagement.service;

import com.hospitalmanagement.entities.Patients;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PatientService {
    public List<Patients> getall();
    public Patients addpatient(Patients patients);

    public Patients updatepatientsdata(int patientid,Patients patients);

    public void deletepatientbyid(int patientid);

    Page<Patients> allpaients(Pageable pageable);
}
