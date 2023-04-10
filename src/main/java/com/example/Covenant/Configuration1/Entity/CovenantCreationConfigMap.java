package com.example.Covenant.Configuration1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_covenant_creation_config_map")
public class CovenantCreationConfigMap {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int CovenantId;
    private String covenantType;
    private String covenantDescription;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "covenantConfigId")
    private CovenantConfig covenantConfig;

}





