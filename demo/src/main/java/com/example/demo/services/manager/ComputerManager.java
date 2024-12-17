package com.example.demo.services.manager;

import com.example.demo.dto.ComputerDTO;

import java.util.List;

public interface ComputerManager {

    public ComputerDTO saveComputer(ComputerDTO ComputerDTO);

    public boolean deleteComputer(Long id);

    public List<ComputerDTO> getComputerByProce(String proce);

    public List<ComputerDTO> getComputerByProceAndPrice(String proce, double price);

    public List<ComputerDTO> saveComputer(List<ComputerDTO> ComputerDTOS);

}
