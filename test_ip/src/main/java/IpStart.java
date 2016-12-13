import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.exit;


public class IpStart {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first IP: ");
        String firstIP = reader.readLine();
        System.out.println("Input second IP: ");
        String secondIP = reader.readLine();
        createListIp(firstIP, secondIP);
    }

    public static void createListIp(String firstIP, String secondIP) {
        try {
            long ip1 = ipToLong(firstIP);
            long ip2 = ipToLong(secondIP);
            ArrayList<String> list = ipList(ip1, ip2);
            toPrint(list);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect input IP address");
        } catch (NumberFormatException e) {
            System.out.println("Invalid IP format");
        }
    }

    public static long ipToLong(String ip) {
        String[] ipString = ip.split("\\D+");
        if (ipString.length == 4) {
            return (Long.valueOf(ipString[0]) << 24) +
                    (Long.valueOf(ipString[1]) << 16) +
                    (Long.valueOf(ipString[2]) << 8) +
                    (Long.valueOf(ipString[3]));

        } else {
            throw new NumberFormatException();
        }
    }

    public static String longToIp(long value) {
        StringBuffer sb = new StringBuffer();
        sb.append((value & 0xFF000000) >> 24).append('.');
        sb.append((value & 0x00FF0000) >> 16).append('.');
        sb.append((value & 0x0000FF00) >> 8).append('.');
        sb.append(value & 0x000000FF);
        return sb.toString();
    }

    public static ArrayList<String> ipList(long ip1, long ip2) {
        ArrayList<String> list = new ArrayList<>();
        while (ip1 < ip2 - 1) {
            ip1++;
            list.add(longToIp(ip1));
        }
        return list;
    }

    public static void toPrint(ArrayList<String> list) {
        if (list.size() == 0) {
            System.out.println("Second IP is greater than or equal to the first IP");
        } else {
            System.out.println("Valid addresses: ");
            for (String ip : list) {
                System.out.println(ip);
            }
        }
    }

}
