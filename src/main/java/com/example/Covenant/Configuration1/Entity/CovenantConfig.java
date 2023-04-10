package com.example.Covenant.Configuration1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tbl_covenant_config")
public class CovenantConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private MstCustomerCategory mstCustomerCategory;
    private MstLoanType loanType;
    private String loanType1;
    private String status;
    private String latestComment;
    private String latestModifiedBy;
    private LocalDateTime latestModifiedDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "covenantConfig", cascade = CascadeType.ALL)
    private List<CovenantCustomerTypeMap> covenantCustomerTypeMap;

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="covenantConfig", cascade = CascadeType.ALL)
    private List<CovenantProductDetailsMap> covenantProductDetailsMap;

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="covenantConfig", cascade = CascadeType.ALL)
    private List<CovenantCreationConfigMap> covenantCreationConfigMap;
}