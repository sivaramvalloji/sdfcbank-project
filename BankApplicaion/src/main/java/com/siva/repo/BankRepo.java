package com.siva.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siva.entity.BankEntity;
@Repository
public interface BankRepo extends CrudRepository<BankEntity, Integer> {

}
