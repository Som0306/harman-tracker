package com.harman.infotracker.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harman.infotracker.model.EmployeeInfo;

public interface TrackerRepository extends JpaRepository<EmployeeInfo, Long>{

}
