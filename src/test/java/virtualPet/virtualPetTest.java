package virtualPet;

import org.junit.Assert;
import org.junit.Test;

public class virtualPetTest {
	@Test
	public void shouldHaveDefaultStats() {
		virtualPet underTest = new virtualPet();
		int health = underTest.getHealth();
		Assert.assertEquals(100, health);
		int hunger = underTest.getHunger();
		Assert.assertEquals(0, hunger);
	}

	@Test
	public void shouldStayInbounds() {
		virtualPet underTest = new virtualPet();
		underTest.play();
		Assert.assertEquals(0, underTest.getBoredom());
	}

	@Test
	public void shouldAssignName() {
		virtualPet underTest = new virtualPet();
		underTest.setName("Billy");
		Assert.assertEquals("Billy", underTest.getName());
	}

	@Test
	public void shouldIncreaseWaste() {
		virtualPet underTest = new virtualPet();
		underTest.giveTreat();
		Assert.assertEquals(5, underTest.checkWaste());
	}
	
	@Test
	public void tickShouldChangeStats() {
		virtualPet underTest = new virtualPet(); 
		underTest.tickIncrease(); 
		Assert.assertEquals(99,underTest.getHealth());
		Assert.assertEquals(2,underTest.getHunger());
		Assert.assertEquals(5,underTest.getBoredom());
		Assert.assertEquals(0,underTest.getThirst());
		Assert.assertEquals(3,underTest.checkWaste());
	}

}
