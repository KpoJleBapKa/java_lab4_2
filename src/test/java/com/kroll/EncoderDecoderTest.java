package com.kroll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncoderDecoderTest {
    @Test
    public void testEmptyString() {
        String originalMessage = "";
        String consonantEncoded = Encoder.encodeConsonantSubstitution(originalMessage);
        String decodedMessage = Decoder.decode(consonantEncoded);

        assertEquals(originalMessage, decodedMessage);
    }
}

