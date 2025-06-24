package hei.school.arith;

import hei.school.arith.endpoint.AdditionController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AdditionControllerTest {
    private final AdditionController subject = new AdditionController();
    @Test
    void testAddition() {
        Assertions.assertEquals(3, subject.add(1,2));
    }

}
