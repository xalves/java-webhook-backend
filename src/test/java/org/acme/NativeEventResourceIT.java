package org.acme;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeEventResourceIT extends EventResourceTest {

    // Execute the same tests but in native mode.
}