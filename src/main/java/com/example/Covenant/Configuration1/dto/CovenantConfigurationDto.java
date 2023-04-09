package com.example.Covenant.Configuration1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CovenantConfigurationDto
{
    private List<Integer> customerCategoryList;
    private List<Integer> customerTypeList;
    private Integer loanTypeList;
    private List<Integer> productIdList;
    private List<CovenantCreationDto> covenantCreationDtoList;

}