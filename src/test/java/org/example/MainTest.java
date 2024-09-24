package org.example;

import org.junit.jupiter.api.Test;  
import static org.junit.jupiter.api.Assertions.assertEquals;  

class MainTest {

    @Test
    void testConcatenate() {
        Main myMain = new Main();

        String result = myMain.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}