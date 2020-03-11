import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestMathOperations {
	int x, y;

	@BeforeEach
	public void setUp() throws Exception {
		x = 4;
		y = 5;
		System.out.println("before");
	}

	@DisplayName("Testing the Add Method...")
	@Test
	public void testAdd() {
		System.out.println("Testing add . . . ");
		int result = MathOperations.add(x, y);
		System.out.println(result);
		assertTrue(result == 9);
	}

	@DisplayName("Testing the Sub Method...")
	@Test
	public void testSub() {
		System.out.println("Testing Sub . . . ");
		int result = MathOperations.subtract(x,y);
		System.out.println(result);
		assertTrue(result == -1);
	}