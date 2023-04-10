package com.example.Covenant.Configuration1.Repository;

import com.example.Covenant.Configuration1.Entity.MstCustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<MstCustomerType,Integer>
{
}
