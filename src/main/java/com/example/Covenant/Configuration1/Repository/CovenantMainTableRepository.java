package com.example.Covenant.Configuration1.Repository;

import com.example.Covenant.Configuration1.Entity.CovenantConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CovenantMainTableRepository extends JpaRepository<CovenantConfig,Integer>
{
    static List<CovenantConfig> GetAll() {
        return null;
    }


  //  @Query("SELECT e FROM CovenantMainTable c LEFT JOIN FETCH c.id LEFT JOIN FETCH c.id")
    //List<CovenantMainTable> findAllWithDepartmentAndProject();
}
