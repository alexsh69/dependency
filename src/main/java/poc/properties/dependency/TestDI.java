package poc.properties.dependency;

public class TestDI implements ITestDI {

    @Override
    public String getPassword(String user) {
        return "User: " + user + "\tPassword: BLABLA";
    }
}
