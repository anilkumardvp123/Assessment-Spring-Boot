package com.example.Covenant.Configuration1.Repository;

import com.example.Covenant.Configuration1.Entity.MstLoanType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanTypeRepository extends JpaRepository<MstLoanType,Integer>
{
}
