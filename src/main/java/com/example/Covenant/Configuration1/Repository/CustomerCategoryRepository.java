package com.example.Covenant.Configuration1.Repository;

import com.example.Covenant.Configuration1.Entity.MstCustomerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCategoryRepository extends JpaRepository<MstCustomerCategory,Integer>
{


   // CustomerCategory save(CustomerCategory customerCategory);


}
