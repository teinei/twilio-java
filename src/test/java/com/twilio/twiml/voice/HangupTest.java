/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Hangup}
 */
public class HangupTest {
    @Test
    public void testEmptyElement() {
        Hangup elem = new Hangup.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Hangup/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Hangup elem = new Hangup.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CHangup%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithExtraAttributes() {
        Hangup elem = new Hangup.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Hangup a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }
}