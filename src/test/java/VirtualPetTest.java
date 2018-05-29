import org.junit.Test;

import junit.framework.Assert;

public class VirtualPetTest {
	VirtualPet Bite = new VirtualPet(100, 100, 100);

	@Test
	public void userGivesWaterToPetToIncreaseThirst() {
		int underTest = Bite.giveWater();

		Assert.assertEquals(110, underTest);

	}

	@Test
	public void userGivesFoodToPetToIncreaseHunger() {
		int underTest = Bite.giveFood();

		Assert.assertEquals(110, underTest);
	}

	@Test
	public void userGivesSleepToPetToIncreaseEnergy() {
		int underTest = Bite.giveSleep();

		Assert.assertEquals(110, underTest);
	}

	@Test
	public void userDoingNothingDecreasedThirst() {
		int underTest = Bite.lostThirst();
		
		Assert.assertEquals(95, underTest);

	}

	@Test
	public void userDoingNothingDecreasedHunger() {
		int underTest = Bite.lostHunger();
		
		Assert.assertEquals(95, underTest);
	}
	
	@Test
	public void userDoingNothingDecreasedEnergy() {
		int underTest = Bite.lostEnergy();
		
		Assert.assertEquals(95, underTest);
	}

	@Test
	public void tickTakesThirst() {
		int underTest = Bite.losesThirst();

		Assert.assertEquals(90, underTest);
	}

	@Test
	public void tickTakesHunger() {
		int underTest = Bite.losesHunger();

		Assert.assertEquals(90, underTest);
	}

	@Test
	public void tickTakesEnergy() {
		int underTest = Bite.losesEnergy();

		Assert.assertEquals(90, underTest);
	}
	
	
	
		
	}
	
