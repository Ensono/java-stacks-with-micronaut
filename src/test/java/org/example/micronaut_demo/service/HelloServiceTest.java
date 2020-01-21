package org.example.micronaut_demo.service;

import io.micronaut.test.annotation.MicronautTest;
import io.micronaut.test.annotation.MockBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.util.StringUtils;
import org.mockito.Mockito;

import javax.inject.Inject;

@MicronautTest
class HelloServiceTest {

    @Inject
    HelloService helloService;

    @Inject
    AppNameService appNameService;

    @ParameterizedTest
    @CsvSource({"John", "Kate"})
    void hello(final String name) {
        String helloResponse = helloService.hello(name);
        Assertions.assertTrue(helloResponse.contains(name));
        Assertions.assertNotEquals(name, helloResponse);
    }

    @Test
    void introduction() {
        Assertions.assertTrue(StringUtils.isNotBlank(helloService.introduction()));
    }

    @Test
    void introduction_mockWithMockito() {
        Mockito.when(appNameService.getAppName())
                .thenReturn("MOCKED");

        String introduction = helloService.introduction();
        Assertions.assertTrue(introduction.contains("MOCKED"));

        Mockito.verify(appNameService).getAppName();
    }

    /**
     * This method is used to indicate the method returns a mock bean. The value to the method is the type being replaced.
     *
     * @return the mocked instance
     */
    @MockBean(value = AppNameServiceImpl.class)
    AppNameService appNameService() {
        return Mockito.mock(AppNameService.class);
    }

}