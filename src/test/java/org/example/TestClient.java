package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class TestClient
{
    @Test
    public void testConnection() throws IOException {
        Client client = new Client();
        client.startConnection("127.0.0.1", 6666);
        String str = client.sendMessage("hello, world");
        assertEquals(str, "hello, world");
        System.out.println(str);
        str = client.sendMessage(".");
        assertEquals(str, "bye");
        System.out.println(str);
    }
}
