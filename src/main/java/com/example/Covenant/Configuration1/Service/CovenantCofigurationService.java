package com.example.Covenant.Configuration1.Service;

import com.example.Covenant.Configuration1.Entity.*;
import com.example.Covenant.Configuration1.dto.CovenantConfigurationDto;
import com.example.Covenant.Configuration1.dto.CovenantCreationDto;

import java.util.List;

public interface CovenantCofigurationService {
    public List<MstCustomerCategory> GetAllCustomerCategory();

    public List<MstCustomerType> GetAllCustomerType();

    public List<MstLoanType> GetAllLoanType();

    public List<MstProductType> GetAllProductId();

    public MstCustomerCategory Save(CovenantConfigurationDto covenantConfigurationDto);


    public List<CovenantConfig> GetAll();

    public CovenantConfig Edit(CovenantConfig covenantConfig);


}
