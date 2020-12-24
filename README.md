# Jython in Java

This is a java implementation of how jython and java can interact.

Use this template to integrate java and python applications.

All python objects must inherrit from a java interface in order to be pulled in as an object. In the example, we use Foo as the parent interface and Bar as the child class. Bar is written in Jython.

## to build

in order to build, simply execute `gradle shadowJar`

## to run

after building, this application can be run with `java -jar build/libs/pythonJava-1.0-SNAPSHOT-all.jar`
