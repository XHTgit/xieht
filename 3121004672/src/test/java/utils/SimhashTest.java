package utils;

import org.junit.Test;

public class SimhashTest {
    @Test
    public void testgetSimHash(){
        String s = Fileu.readFile("C:\\Users\\SyMy\\Desktop\\orig_0.8_add.txt");
        String simHash = Simhash.getSimHash(s);
        System.out.println(simHash);
    }

    @Test
    public void testgetHash(){
        String s = Fileu.readFile("C:\\Users\\SyMy\\Desktop\\orig_0.8_add.txt");
        String hash = Simhash.getHash(s);
        System.out.println(hash);
    }
}
