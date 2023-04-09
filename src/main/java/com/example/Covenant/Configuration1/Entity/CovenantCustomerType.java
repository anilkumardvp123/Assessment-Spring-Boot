package com.example.Covenant.Configuration1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CustomerType")
public class CovenantCustomerType
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne(cascade=CascadeType.ALL,fetch =FetchType.LAZY )
    @JoinColumn(name = "id")
    @JsonIgnore
    private CovenantCustomerType covenantCustomerType;
    private CovenantMainTable covenantMainTable;




}