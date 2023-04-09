package com.example.Covenant.Configuration1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CovenantCreation")
public class CovenantCreation {
    private int CovenantId;
    private String covenantType;
    private String covenantDescription;
   // @ManyToOne(fetch = FetchType.LAZY)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

}





