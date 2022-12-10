import com.intuit.karate.junit5.Karate;

public class testRunner {
    @Karate.Test
    public Karate runTest(){
        return Karate.run("src/test/java/Features");
    }
}
