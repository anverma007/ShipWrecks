package com.boot.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ShipwreckTest {

	Shipwreck shipWreck;
	
	@Before
	public void setup() {
		shipWreck = new Shipwreck();
		shipWreck.setId(1L);
		shipWreck.setLatitude(2.0);
		shipWreck.setLongitude(3.0);
		shipWreck.setCondition("String");
		shipWreck.setDepth(100);
		shipWreck.setDescription("Demo");
		shipWreck.setName("MT");
		shipWreck.setYearDiscovered(1950);	
		
		shipWreck = new Shipwreck(1L,"MT", "Demo", "String", 100, 2.0, 3.0, 1950);
	}
	
	@Test
	public void testGetId() {
		long id = shipWreck.getId();
		assertNotNull(id);
	}
	@Test
	public void getLatitudeTest() {
		assertNotNull(shipWreck.getLatitude());
	}
	@Test
	public void getLongitudeTest() {
		assertNotNull(shipWreck.getLongitude());
	}
	@Test
	public void getConditionTest() {
		assertNotNull(shipWreck.getCondition());
	}
	@Test
	public void getDepthTest() {
		assertNotNull(shipWreck.getDepth());
	}
	@Test
	public void getNameTest() {
		assertNotNull(shipWreck.getName());
	}
	@Test
	public void getDescriptionTest() {
		assertNotNull(shipWreck.getDescription());
	}
	@Test
	public void getYearDiscoveredTest() {
		assertNotNull(shipWreck.getYearDiscovered());
	}
	
}
