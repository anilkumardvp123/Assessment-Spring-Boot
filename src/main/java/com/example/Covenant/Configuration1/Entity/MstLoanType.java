package com.example.Covenant.Configuration1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_mst_loan_type")
public class MstLoanType
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String LoanType;

}
