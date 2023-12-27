package com.app.testthuctap.repository;

import com.app.testthuctap.entity.Decentralization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecentralizationRepository extends JpaRepository<Decentralization,Long> {
}
