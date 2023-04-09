package com.example.Covenant.Configuration1.Service;

import com.example.Covenant.Configuration1.Entity.*;
import com.example.Covenant.Configuration1.dto.CovenantConfigurationDto;
import com.example.Covenant.Configuration1.dto.CovenantCreationDto;

import java.util.List;

public interface CovenantCofigurationService
{
   public List<CustomerCategory> GetAllCustomerCategory();

   public List<CustomerType> GetAllCustomerType();

  public List<LoanType> GetAllLoanType();

   public List<ProductId> GetAllProductId();
   public CustomerCategory Save(CovenantConfigurationDto covenantConfigurationDto);


    public List<CovenantMainTable> GetAll();

    public CovenantMainTable Edit(CovenantMainTable covenantMainTable);


    CovenantCreation add(CovenantCreationDto covenantCreationDto);
}
