package com.example;

import com.example.model.Customer;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class RestfulApplicationTests extends Assert {

	RestTemplate template = new RestTemplate();
	private static final String BASE_URI = "http://localhost:8080/customers";

	@Test
	public void test_get_all_customers_getForObject(){
		List<Customer> list = template.getForObject(BASE_URI,List.class);
		assertNotNull(list);
	}

	@Test
	public void test_get_all_customers_getForEntity(){
		ResponseEntity<List> reponse = template.getForEntity(BASE_URI,List.class);
		assertEquals(reponse.getStatusCode().value(),200);
	}

	/*@Test(expected = HttpClientErrorException.class)
	public void test_delete_operation_failed_exception(){
		ResponseEntity<List> reponse;
		reponse = template.exchange("http://localhost:8080/customers/100", HttpMethod.DELETE, null, String.class);
		assertTrue(reponse.getStatusCode().is2xxSuccessful());
	}*/
	@Test(expected = HttpClientErrorException.class)
	public void test_delete_operation_success(){
		template.delete("http://localhost:8080/customers/1");
		ResponseEntity<Customer> response = template.getForEntity("http://localhost:8080/customers/1",Customer.class);

	}
}
