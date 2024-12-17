package com.example.demo.services.service;

import com.example.demo.dao.entity.Computer;
import com.example.demo.dao.repository.ComputerRepository;
import com.example.demo.dto.ComputerDTO;
import com.example.demo.services.manager.ComputerManager;
import com.example.demo.services.mappers.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerService implements ComputerManager {

    @Autowired
    private ComputerRepository ComputerRepository;
    @Autowired
    private ComputerMapper ComputerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO ComputereDto) {
        // Convert DTO to Entity
        Computer Computer = ComputerMapper.fromComputerDtoToComputer(ComputerDto);

        // Save Entity
        Computer = ComputerRepository.save(Computer);

        // Convert Entity back to DTO and return
        return ComputerMapper.fromComputerToComputerDto(Computer);
    }


    @Override
    public boolean deletePComputer(Long id) {
        try {
            ComputerRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> Computers = ComputerRepository.findByproce(proce);
        List<ComputerDTO> ComputerDtos = new ArrayList<>();
        for (Computer computer : Computers) {
            ComputerDtos.add(ComputerMapper.fromComputerToComputerDto(computer));
        }
        return ComputerDtos;
    }


    @Override
    public List<ComputerDTO> getComputerByProceAndPrice(String proce, double price) {
        List<Computer> Computers = ComputerRepository.findByProceAndPrice(proce, price);
        List<ComputerDTO> ComputerDtos = new ArrayList<>();
        for (Computer Computer: Computers) {
            ComputerDtos.add(ComputerMapper.fromComputerToComputerDto(Computer));
        }
        returnComputerDtos;
    }

    @Override
    public List<ComputerDTO> saveComputer(List<ComputerDTO> ComputerDtos) {

        List<Computer> Computer = new ArrayList<>();
        for (ComputerDTO ComputerDto : ComputerDtos) {
            Computer.add(ComputerMapper.fromComputerDtoToPComputer(ComputerDto));
        }

        Computer = ComputerRepository.save(Computer);

        ComputerDtos = new ArrayList<>();
        for (Computer Computer : Computer) {
            ComputerDtos.add(ComputerMapper.fromComputerToComputerDto(Computer));
        }
        return ComputerDtos;
    }
}
