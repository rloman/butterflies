package nl.workingspirit.butterflies;

import nl.workingspirit.butterflies.services.ButterflyService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ButterfliesServiceIT {


	@Autowired
	private ButterflyService service;


	@Test
	public void testServiceAdd() {
		Assert.assertEquals(4, this.service.add(1,3));
	}

	@Test
	public void testSaveAndFindAll() {
		int currentLength = this.service.findAll().size();

		Butterfly newButterfly = new Butterfly();
		newButterfly.setAge(3);
		newButterfly.setName("Dagpauwoog");

		this.service.save(newButterfly);


		int newLength = this.service.findAll().size();

		Assert.assertEquals(newLength, currentLength+1);


	}



}
