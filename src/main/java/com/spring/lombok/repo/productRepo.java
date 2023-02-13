package com.spring.lombok.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.lombok.entity.Producttt;



@Repository
public interface productRepo extends JpaRepository<Producttt, Integer> {

}
