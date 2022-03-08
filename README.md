Properties to YAML Converter
===

**NOTE:** forked from the [original repository](https://github.com/Codearte/props2yaml) just to test how to build the project with Gradle. In particular to have a functional test approach for the [`de.benediktritter.maven-plugin-development` gradle plugin](https://www.benediktritter.de/maven-plugin-development/). Discussion open at [britter/maven-plugin-development#41](https://github.com/britter/maven-plugin-development/issues/41).

Library usage:

    String yaml = Props2YAML.fromContent(content).convert();
    String yaml = Props2YAML.fromFile(file).convert();
    String yaml = Props2YAML.fromFile(path).convert();

or from command line:

    $ mvn io.codearte.props2yaml:props2yaml-maven-plugin:convert -Dproperties=application.properties

or

    $ wget http://central.maven.org/maven2/io/codearte/props2yaml/props2yaml/0.3/props2yaml-0.3-jar-with-dependencies.jar
    $ java -jar props2yaml-0.3-jar-with-dependencies.jar application.properties

There is also IntelliJ IDEA plugin called "[Properties to YAML Converter](https://plugins.jetbrains.com/plugin/8000)" which provides easy way of using this library

Online converter: https://props2yaml-codearte2foss.rhcloud.com/conversion
