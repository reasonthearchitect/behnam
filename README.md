# Behnams Server

This server has a simple API for Behnam to call when doing ML on faces. 

## Set Up

You will need:

* Java 8 JDK
* A newer web browser

Once you have cloned the code, cd into this directory.

Run:

```
gradlew.bat clean build bootrun
```

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