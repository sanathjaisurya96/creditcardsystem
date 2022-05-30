package com.PITask.creditcardsystem;

import com.PITask.creditcardsystem.controller.CreditCardDetailsController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class CreditcardsystemApplicationTests {

	private MockMvc mockMvc;

	@BeforeEach
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new CreditCardDetailsController())
				.build();
	}

	@Test
	public void givenPhonePageUri_whenMockMvc_thenReturnsPhonePage() throws Exception {
		this.mockMvc.perform(get("/api/credit-card-details")).andExpect(status().isOk());
	}

	@Test
	public void givenPhoneURIWithPostAndFormData_whenMockMVC_thenVerifyErrorResponse() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.post("/api/credit-card-details")
						.accept(MediaType.TEXT_HTML)
						.param("cardNumber", "3256"))
				.andExpect(model().attributeHasFieldErrorCode("CreditCardDetails", "cardNumber", "CardNumberConstraint"))
				.andExpect(status().isCreated());
	}

}
