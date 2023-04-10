package com.example.Covenant.Configuration1;

import com.example.Covenant.Configuration1.Entity.CovenantConfig;
import com.example.Covenant.Configuration1.Entity.CovenantConfig;
import com.example.Covenant.Configuration1.Repository.CovenantMainTableRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CovenantConfiguration1ApplicationTests {
	@Autowired
	private CovenantMainTableRepository covenantMainTableRepository;

	@Test
	public void Create() {
	CovenantConfig covenantMainTable = new CovenantConfig();
    covenantMainTable.setId(1);
	covenantMainTable.setCustomerCategory("Business");
	covenantMainTable.setLoanType("Secure");
		covenantMainTable.setStatus("Active");
	covenantMainTable.setLatestComment("Good");
	covenantMainTable.setLatestModifiedBy("aaa");
		covenantMainTable.setLatestModifiedDate(LocalDateTime.parse("19/08/2022"));
		assertNotNull(covenantMainTable.getId());
		assertNotNull(covenantMainTable.getLoanType());
}

	@Test
public void ReadAll() {
		List<CovenantConfig> listAll = CovenantMainTableRepository.GetAll();
		assertThat(listAll).size().isGreaterThan(0);
		assertThat(listAll).size().isLessThan(20);

	}

	@Test
	public void UpdateCovenantTable() {
		CovenantConfig covenantMainTable = CovenantMainTableRepository.GetAll().get(1);
		covenantMainTable.setId(3);
		covenantMainTable.setStatus("InActive");
		covenantMainTableRepository.save(covenantMainTable);
		assertNotEquals("active", covenantMainTableRepository.findById(1).get().getLatestComment());

	}
}




