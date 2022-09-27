
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;


class SQRServiceTest {
    SQRService sqrService = new SQRService();
    private int min;

    @Test
    void calculateSQR() {
        int expected = 3;
        int actual = sqrService.calcSqr(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcLessMinimum() {

        int expected = 0;
        int min = 10;
        int max = 99;

        int actual = sqrService.calcSqr(min, max);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalcMinimum() {

        int expected = 1;
        int min = 10;
        int max = 100;

        int actual = sqrService.calcSqr(min, max);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalcMaximum() {

        int expected = 90;
        int min = 100;
        int max = 9801;

        int actual = sqrService.calcSqr(min, max);
        Assertions.assertEquals(expected, actual);

    }
}
