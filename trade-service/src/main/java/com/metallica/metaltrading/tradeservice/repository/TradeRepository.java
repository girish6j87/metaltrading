package com.metallica.metaltrading.tradeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metallica.metaltrading.tradeservice.dao.bean.TradeEntity;

public interface TradeRepository extends JpaRepository<TradeEntity,Long>{

}
