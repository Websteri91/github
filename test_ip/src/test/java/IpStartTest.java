import org.junit.Test;

public class IpStartTest {
    @Test
    public void testCreateList() throws Exception {
        IpStart.createListIp("192.168.14.1", "192.168.14.5");
        IpStart.createListIp("192.168.14.1", "192.168.13.5");
        IpStart.createListIp("sdafsdf", "192.168.13.5");
        IpStart.createListIp("192.168.14.1", "dsfdd");
        IpStart.createListIp("sdasdas", "sadsd");
        IpStart.createListIp("192.168", "192.168.13.5");
        IpStart.createListIp("192.sdsd.14.11", "192.168.13.5");
        IpStart.createListIp("", "");
    }
}
