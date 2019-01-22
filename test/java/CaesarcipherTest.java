import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarcipherTest {

    @Test
    public void Cipher_testingEncryptingmethod() {
        Cipher cipher =new Cipher();
        assertEquals("fb",cipher.encrypt("fbi",1));
    }

    @Test
    public void Cipher_testingDecryptingMethod() {
        Cipher cipher =new Cipher();
        assertEquals("fbi",cipher.decrypt("fb",1));
    }


}