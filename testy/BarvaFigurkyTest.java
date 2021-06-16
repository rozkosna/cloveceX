import model.BarvaFigurky;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BarvaFigurkyTest {

    @Test
    void getStart() {
        BarvaFigurky bar = new BarvaFigurky(4,4);
        System.out.println(bar.getStart());
    }

    @Test
    void getCil() {
    }
}