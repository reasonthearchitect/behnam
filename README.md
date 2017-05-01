# Behnams Server

This server has a simple API for Behnam to call when doing ML on faces. 

## Setup: Simple

The following are the instructions for running the application from the command line. Note that you will only need the Java8 JRE for this to work.

As a result, to be clear... the JDK does not need to be installed as I have supplied a copy in source. You can, using this mechanic, skip to the "Open the Browser" section.

First clone the code.

Once you have cloned the code, cd into this directory.

To run from the jar, simply type the following and you will be up and running:

```
java -jar behnam.jar
```

## Setup: Build

If you ran from the JAR (see above) you can ignore this section.

You will need:

* Java 8 JDK
* A newer web browser

Once you have cloned the code, cd into this directory.

Run:

```
gradlew.bat clean build bootrun
```

## Open The Browser
Once this executes (give it a few mins the first time as gradle and its dependancies need to be downloaded), you will be able to open a web brower @ the following address:

```
http://localhost:8080
```

Choose the connect button:

![Alt](/ConnectButton.png "Connect Button")

## The API

You can use the UI to see people entering and leaving as well as hear an audio file for Hello, Goodbye, and Denied.

To use the API, you can simply use the following CuRL command... replace USEER_NAME with the name of the user from the ML stuff:

```
curl -X GET http://localhost:8080/api/hello/USER_NAME
```

If the user is denied, send the following to API and a denied audio clip will play:

```
curl -X GET http://localhost:8080/api/denied
```