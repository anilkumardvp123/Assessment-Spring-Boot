package com.example.Covenant.Configuration1.Controller;

import com.example.Covenant.Configuration1.Entity.*;
import com.example.Covenant.Configuration1.Service.CovenantCofigurationService;
import com.example.Covenant.Configuration1.dto.CovenantConfigurationDto;
import com.example.Covenant.Configuration1.dto.CovenantCreationDto;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CovenantConfigurationController
{
    @Autowired
    private CovenantCofigurationService covenantCofigurationService;
    @PostMapping("/Save")
    public CustomerCategory Save(@RequestBody CovenantConfigurationDto covenantConfigurationDto)
    {
         return covenantCofigurationService.Save(covenantConfigurationDto);
    }
    @PostMapping("/Add")
    public CovenantCreation add(@RequestBody CovenantCreationDto covenantCreationDto)
    {
        return covenantCofigurationService.add(covenantCreationDto);
    }

//    @PostMapping("/CustomerType")
//    public CustomernType LoanTypeSave(@RequestBody LoanType loanType)
//    {
//        return covenantCofigurationService.LoanTypeSave(loanType);
//    }
//    @PostMapping("/ProductId")
//    public ProductId ProductIdSave(@RequestBody ProductId productId)
//    {
//        return covenantCofigurationService.ProductIdSave(productId);
//    }
    @GetMapping("/CustomerCategory")
    public List<CustomerCategory> GetAllCustomerCategory()
    {

        return covenantCofigurationService.GetAllCustomerCategory();
    }
    @GetMapping("/CustomerType")
    public List<CustomerType> GetAllCustomerType()
    {

        return covenantCofigurationService.GetAllCustomerType();
    }
    @GetMapping("/LoanType")
    public List<LoanType> GetAllLoanType()
    {

        return covenantCofigurationService.GetAllLoanType();
    }
    @GetMapping("/ProductId")
    public List<ProductId> GetAllProductId()
    {

        return covenantCofigurationService.GetAllProductId();
    }
    @GetMapping("/fecthAll")
    public List<CovenantMainTable> GetAll()
    {
        return covenantCofigurationService.GetAll();
    }
    @PutMapping("/Edit")
    public CustomerCategory Edit(@PathVariable CovenantConfigurationDto covenantConfigurationDto,@RequestBody CovenantConfigurationDto covenantMainTable)
    {
        covenantMainTable.setCovenantCreationDtoList((List<CovenantCreationDto>) covenantMainTable);

        return covenantCofigurationService.Save(covenantMainTable);
    }


}
