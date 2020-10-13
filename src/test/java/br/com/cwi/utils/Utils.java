package br.com.cwi.utils;

public class Utils {

    public static String getContractsBasePath(String pack, String json) {
        return System.getProperty("user.dir")
                + "/src/test/java/br/com/cwi/tests/"
                + pack
                + "/contract/"
                + json
                + ".json";
    }
}
