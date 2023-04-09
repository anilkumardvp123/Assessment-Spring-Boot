package com.example.Covenant.Configuration1.Repository;

import com.example.Covenant.Configuration1.Entity.CovenantMainTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CovenantMainTableRepository extends JpaRepository<CovenantMainTable,Integer>
{
    static List<CovenantMainTable> GetAll() {
        return null;
    }


  //  @Query("SELECT e FROM CovenantMainTable c LEFT JOIN FETCH c.id LEFT JOIN FETCH c.id")
    //List<CovenantMainTable> findAllWithDepartmentAndProject();
}
