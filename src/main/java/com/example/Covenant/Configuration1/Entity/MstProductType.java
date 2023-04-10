package com.example.Covenant.Configuration1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_mst_product_type")
public class MstProductType
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ProductId;

}