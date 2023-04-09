package com.example.Covenant.Configuration1.Repository;

import com.example.Covenant.Configuration1.Entity.CustomerCategory;
import com.example.Covenant.Configuration1.Entity.CustomerType;
import com.example.Covenant.Configuration1.Entity.LoanType;
import com.example.Covenant.Configuration1.Entity.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCategoryRepository extends JpaRepository<CustomerCategory,Integer>
{


   // CustomerCategory save(CustomerCategory customerCategory);


}
