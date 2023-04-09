package com.example.Covenant.Configuration1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ProductId")
public class ProductId
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ProductId;

}