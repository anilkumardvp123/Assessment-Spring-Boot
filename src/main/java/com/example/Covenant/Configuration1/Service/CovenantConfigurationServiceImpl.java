package com.example.Covenant.Configuration1.Service;

import com.example.Covenant.Configuration1.Entity.*;
import com.example.Covenant.Configuration1.Entity.MstCustomerType;
import com.example.Covenant.Configuration1.Repository.*;
import com.example.Covenant.Configuration1.dto.CovenantConfigurationDto;
import com.example.Covenant.Configuration1.dto.CovenantCreationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovenantConfigurationServiceImpl implements CovenantCofigurationService
{
    @Autowired
    private CustomerCategoryRepository customerCategoryRepository;
    @Autowired
    private CustomerTypeRepository customerTypeRepository;
    @Autowired
    private LoanTypeRepository loanTypeRepository;
    @Autowired
    private ProductIdRepository productIdRepository;
    @Autowired
    private CovenantCreationRepository covenantCreationRepository;
    @Autowired
    private CovenantCustomerTypeRepository covenantCustomerTypeRepository;
    @Autowired
    private CovenantProductIdRepository covenantProductIdRepository;
    @Autowired
    private CovenantMainTableRepository covenantMainTableRepository;


    @Override
    public List<MstCustomerCategory> GetAllCustomerCategory() {
        return customerCategoryRepository.findAll();
    }

    @Override
    public List<MstCustomerType> GetAllCustomerType()
    {
        return customerTypeRepository.findAll();
    }

    @Override
    public List<MstLoanType> GetAllLoanType() {
        return loanTypeRepository.findAll();
    }

    @Override
    public List<MstProductType> GetAllProductId() {
        return productIdRepository.findAll();
    }

    @Override
    public MstCustomerCategory Save(CovenantConfigurationDto covenantConfigurationDto) {

        covenantConfigurationDto.getCustomerCategoryList().forEach(customerCategory -> {
            MstCustomerCategory cc = MstCustomerCategory.builder().id(customerCategory).build();
            CovenantConfig.builder()
                    .mstCustomerCategory(cc)
                    .build();
            covenantConfigurationDto.getCustomerCategoryList();
            covenantMainTableRepository.save(null);
        });
        return null;
    }

    @Override
    public List<CovenantConfig> GetAll() {
        return covenantMainTableRepository.findAll();
    }

    @Override
    public CovenantConfig Edit(CovenantConfig covenantConfig) {
        return null;
    }




    }




