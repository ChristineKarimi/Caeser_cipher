import org.junit.Test;

import static org.junit.Assert.*;

// class name is CaesarcipherTest 
public class CipherTest {

    @Test
    public void Cipher_testingEncryptingmethod() {
        Cipher cipher =new Cipher();
        assertEquals("fb",cipher.encrypt("fbi",1));
    }
    // cipher.encrypt is the name of the method containing this behavior
    // The line assertEquals(fb, cipher.encrypt("fbi",1)); asserts (or confirms) that calling cipher.encrypt() with the name fbi successfully returns fb

    @Test
    public void Cipher_testingDecryptingMethod() {
        Cipher cipher =new Cipher();
        assertEquals("fbi",cipher.decrypt("fb",1));
    }


}