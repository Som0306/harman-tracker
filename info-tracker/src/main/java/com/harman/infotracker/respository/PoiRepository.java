package com.harman.infotracker.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harman.infotracker.model.PoiDetail;

public interface PoiRepository extends JpaRepository<PoiDetail, Long>{

}
