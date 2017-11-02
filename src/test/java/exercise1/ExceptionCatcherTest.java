package exercise1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ExceptionCatcherTest {
	@Mock
	private ExceptionThrower exceptionThrower;

	private ExceptionCatcher exceptionCatcher;

	@Before
	public void setUp() {
		exceptionCatcher = new ExceptionCatcher(exceptionThrower);
	}

	@Test
	public void executeExceptionThrowerSafely_when_throwing_exception() {
		doThrow(new TestCustomException()).when(exceptionThrower).throwACustomExceptionWhenValueIs42(42);

		exceptionCatcher.executeExceptionThrowerSafely(42);

		verify(exceptionThrower).throwACustomExceptionWhenValueIs42(42);
	}

	@Test
	public void executeExceptionThrowerSafely_when_not_throwing_exception() {
		exceptionCatcher.executeExceptionThrowerSafely(1);

		verify(exceptionThrower).throwACustomExceptionWhenValueIs42(1);
	}

}
