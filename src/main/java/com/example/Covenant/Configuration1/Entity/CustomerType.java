package com.example.Covenant.Configuration1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CustomerType")
public class CustomerType
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String CustomerType;
}
