package exercise1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ExceptionThrowerTest {

	@Test
	public void throwACustomExceptionWhenValueIs42_with_42() {
		Assertions.assertThatThrownBy(() -> new ExceptionThrower().throwACustomExceptionWhenValueIs42(42))
			.isInstanceOf(RuntimeException.class);
	}

	@Test
	public void throwACustomExceptionWhenValueIs42_with_any_other_value() {
		ExceptionThrower exercise1 = new ExceptionThrower();
		for (int i = 0; i < 100; i++) {
			if (i != 42) {
				exercise1.throwACustomExceptionWhenValueIs42(i);
			}
		}
	}
}
