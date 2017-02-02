package com.atribe.reproducingbug;

import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDateTime;

import static org.junit.Assert.assertNotNull;

public class ParentObjectTest {
    @Test
    public void deserializeTest() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("TestJson.json").getFile());

        String testJson = new String(Files.readAllBytes(file.toPath()));

        ParentObject parentObject = ParentObject.deserialize(testJson);

        assertNotNull(parentObject.getChildSet().get(0));
    }
}