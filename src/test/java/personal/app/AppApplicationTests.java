package personal.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AppApplicationTests {

	@Test
	void contextLoads() {
	var str = """
		..  You can write
		..  two line string.
		  """;

	var str2 = """
	..  You can write
	..  two line string.
	  """;

	assertEquals(str, str2);

	}

}
