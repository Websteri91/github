import org.junit.Test;

/**
 * Created by Артур on 13.12.2016.
 */
public class StartTest {

    @Test
    public void validateTest(){
        Start.validate("Pupkin V.V.");
        Start.validate("Ogurcov A.A.");
        Start.validate("");
        Start.validate(null);
        Start.validate("Bukin V.A.");
        Start.validate("Belkin 21");
    }
}
