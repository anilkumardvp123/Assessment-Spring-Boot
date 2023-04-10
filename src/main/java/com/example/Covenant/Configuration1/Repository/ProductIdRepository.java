package com.example.Covenant.Configuration1.Repository;

import com.example.Covenant.Configuration1.Entity.MstProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductIdRepository extends JpaRepository<MstProductType,Integer>
{
}
