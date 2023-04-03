package com.LaHuellita.dao;

import com.LaHuellita.domain.Credito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditoDao extends JpaRepository<Credito, Long>{
    
}