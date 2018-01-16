//package unit.gasstation;
//
//import static org.junit.Assert.*;
//
//import org.junit.Before;
//import org.junit.Test;
//
//public class TankToolTest {
//	
//	public TankTool tt;
//
//	@Before
//	public void before() {
//		tt = new TankTool();
//	}
//	
//	@Test
//	public void shouldTestConstructor() {
//		TankTool tt = new TankTool(50, 50, 5);
//		assertNotNull(tt);
//	}
//	
//	@Test
//	public void shouldGetCurrentCapacity() {
//		assertTrue(25 == tt.getCurrentCapacity());
//	}
//	
//	@Test
//	public void shouldGetCapactiy() {
//		assertTrue(50 == tt.getCapacity());
//	}
//	
//	@Test
//	public void shouldGetLitersPerKilometer() {
//		assertTrue(5 == tt.getLitersPerKilometer);
//	}
//	
//	@Test
//	public void shouldIGetFuelNegative() {
//		String answer = tt.shouldIGetFuel(50, 75, 5);
//		assertEquals("No.", answer);
//	}
//	
//	@Test
//	public void shouldIGetFuelPositive() {
//		String answer = tt.shouldIGetFuel(50, 5, 5);
//		assertEquals("Yes!", answer);
//	}
//	
//	@Test
//	public void shouldIGetFuelNull() {
//		String answer = tt.shouldIGetFuel(50, 5, 0);
//		assertEquals("No.", answer);
//	}
//	
//	@Test
//	public void shouldIGetFuelTankToSmall() {
//		String answer = tt.shouldIGetFuel(0, 5, 5);
//		assertEquals("Tank is to small!", answer);
//	}
//	
//	@Test
//	public void shouldIGetFuelTankEmpty() {
//		String answer = tt.shouldIGetFuel(50, 0, 10);
//		assertEquals("Yes!", answer);
//	}
//	
//}
