package io.codearte.props2yaml.maven;

import org.junit.Rule;
import org.junit.Test;

import java.io.File;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.Enumeration;


public class DebugTest {

    @Test
    public void testName() throws Exception {
        System.out.println(getClass().getClassLoader());

        if (getClass().getClassLoader() instanceof URLClassLoader) {
            Arrays.stream(((URLClassLoader) getClass().getClassLoader()).getURLs())
                    .forEach(e -> System.out.println(e));
        } else {
            System.out.println("XXXX Not a URLClassLoader");
        }

        Enumeration<URL> resources = getClass().getClassLoader()
                .getResources("META-INF/maven/plugin.xml");
        while (resources.hasMoreElements()) {
            System.out.println(resources.nextElement());
        }
    }

}
