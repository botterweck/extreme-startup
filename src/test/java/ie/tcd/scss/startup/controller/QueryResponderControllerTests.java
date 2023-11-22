package ie.tcd.scss.startup.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class QueryResponderControllerTests {

//    @LocalServerPort
//    private int port;

//    @Autowired
//    private TestRestTemplate restTemplate;

    /**
     * Note that the test calls the controller directly and does not use the REST API. Hence, port and restTemplate are not needed.
     */
    @Test
    public void processQueryShouldReturnName() {
        QueryResponderController controller = new QueryResponderController();
        String result = controller.processQuery("What is your name?");
        assertThat(result).isEqualTo("Goetz");
    }
}
