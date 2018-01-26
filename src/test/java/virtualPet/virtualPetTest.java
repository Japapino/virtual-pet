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

}
