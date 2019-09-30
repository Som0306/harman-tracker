package com.harman.infotracker.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harman.infotracker.model.PoiDetail;

public interface PoiRepository extends JpaRepository<PoiDetail, Long>{
	
	List<PoiDetail> findAllByharmanId(long harmanId);



}
