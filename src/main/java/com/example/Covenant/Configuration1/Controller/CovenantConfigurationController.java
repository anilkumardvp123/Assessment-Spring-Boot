package com.example.Covenant.Configuration1.Controller;

import com.example.Covenant.Configuration1.Entity.*;
import com.example.Covenant.Configuration1.Service.CovenantCofigurationService;
import com.example.Covenant.Configuration1.dto.CovenantConfigurationDto;
import com.example.Covenant.Configuration1.dto.CovenantCreationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CovenantConfigurationController
{
    @Autowired
    private CovenantCofigurationService covenantCofigurationService;
    @GetMapping("/CustomerCategory")
    public List<MstCustomerCategory> GetAllCustomerCategory()
    {

        return covenantCofigurationService.GetAllCustomerCategory();
    }
    @GetMapping("/CustomerType")
    public List<MstCustomerType> GetAllCustomerType()
    {

        return covenantCofigurationService.GetAllCustomerType();
    }
    @GetMapping("/LoanType")
    public List<MstLoanType> GetAllLoanType()
    {

        return covenantCofigurationService.GetAllLoanType();
    }
    @GetMapping("/ProductId")
    public List<MstProductType> GetAllProductId()
    {

        return covenantCofigurationService.GetAllProductId();
    }
    @PostMapping("/Save")
    public MstCustomerCategory Save(@RequestBody CovenantConfigurationDto covenantConfigurationDto)
    {
        return covenantCofigurationService.Save(covenantConfigurationDto);
    }

    @GetMapping("/fecthAll")
    public List<CovenantConfig> GetAll()
    {
        return covenantCofigurationService.GetAll();
    }
    @PutMapping("/Edit")
    public MstCustomerCategory Edit(@PathVariable int id , @RequestBody CovenantConfigurationDto covenantConfigurationDto)
    {
        covenantConfigurationDto.setCovenantCreationDtoList((List<CovenantCreationDto>) covenantConfigurationDto);

        return covenantCofigurationService.Save(covenantConfigurationDto);
    }


}
