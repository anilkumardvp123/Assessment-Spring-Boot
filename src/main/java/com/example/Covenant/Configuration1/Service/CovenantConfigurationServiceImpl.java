package com.example.Covenant.Configuration1.Service;

import com.example.Covenant.Configuration1.Entity.*;
import com.example.Covenant.Configuration1.Entity.CustomerType;
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
    public List<CustomerCategory> GetAllCustomerCategory() {
        return customerCategoryRepository.findAll();
    }

    @Override
    public List<CustomerType> GetAllCustomerType()
    {
        return customerTypeRepository.findAll();
    }

    @Override
    public List<LoanType> GetAllLoanType() {
        return loanTypeRepository.findAll();
    }

    @Override
    public List<ProductId> GetAllProductId() {
        return productIdRepository.findAll();
    }

    @Override
    public CustomerCategory Save(CovenantConfigurationDto covenantConfigurationDto) {

        covenantConfigurationDto.getCustomerCategoryList().forEach(customerCategory -> {
            CustomerCategory cc = CustomerCategory.builder().id(customerCategory).build();
            CovenantMainTable.builder()
                    .customerCategory(cc)
                    .build();
            covenantConfigurationDto.getCustomerCategoryList();
            covenantMainTableRepository.save(null);
        });
        return null;
    }

    @Override
    public List<CovenantMainTable> GetAll() {
        return covenantMainTableRepository.findAll();
    }

    @Override
    public CovenantMainTable Edit(CovenantMainTable covenantMainTable) {
        return null;
    }

    @Override
    public CovenantCreation add(CovenantCreationDto covenantCreationDto) {
        return null;
    }


    //List<CustomerCategory>  customerCategories=new ArrayList<>();

}
