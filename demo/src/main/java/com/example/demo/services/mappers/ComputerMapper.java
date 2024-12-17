package com.example.demo.services.mappers;

import com.example.demo.dao.entity.Computer;
import com.example.demo.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ProceMapper mapper = new ProceMapper();


    public Computer fromComputerDtoToComputer(ComputerDTO ComputerDto) {
        return mapper.map(ComputerDto, Computer.class);
    }


    public ComputerDTO fromComputerToComputerDto(Computer Computer) {
        return mapper.map(Computer, ComputerDTO.class);
    }
}
