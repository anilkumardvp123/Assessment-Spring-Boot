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
@Table(name = "CovenantMainTable")
public class CovenantMainTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private CustomerCategory customerCategory;
    //private String customerCategory1;
    private LoanType loanType;
    private String loanType1;
    private String status;
    private String latestComment;
    private String latestModifiedBy;
    private LocalDateTime latestModifiedDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id", cascade = CascadeType.ALL)
    private List<CovenantCustomerType> covenantCustomerType;

    public List<CovenantCustomerType> getCovenantCustomerType() {
        return covenantCustomerType;
    }

    public void setCovenantCustomerType(List<CovenantCustomerType> covenantCustomerType) {
        this.covenantCustomerType = covenantCustomerType;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="id", cascade = CascadeType.ALL)
    private List<CovenantProductId> covenantProductId;

    public List<CovenantProductId> getCovenantProductId() {
        return covenantProductId;
    }

    public void setCovenantProductId(List<CovenantProductId> covenantProductId) {
        this.covenantProductId = covenantProductId;
    }
}