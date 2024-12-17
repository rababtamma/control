package com.example.demo.dao.repository;


import com.example.demo.dao.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {


    public List<Computer> findByProce(String model);

    public List<Computer> findByModelAndPrice(String model, double price);

}
