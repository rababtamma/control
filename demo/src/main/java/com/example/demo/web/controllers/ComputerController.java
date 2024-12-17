package com.example.demo.web.controllers;
import com.example.demo.dto.ComputerDTO;
import com.example.demo.services.service.ComputerService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class ComputerController {

    @Autowired
    private ComputerService ComputerService ;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO Computer) {
        return ComputerService.saveComputer(Computer);
    }

    @MutationMapping
    public Boolean deleteComputer(@Argument Long id){
        return ComputerService.deleteComputer(id);
    }


    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce){
        returnComputerService.getComputerByProce(proce);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProceAndPrice(@Argument String proce, @Argument double price){
        return ComputerService.getComputerByProceAndPrice(proce, price);
    }
}