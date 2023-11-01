# basic-template

This is the _basic_ template for a [Merrymake](merrymake.dev) service.

## Explanation

The `merrymake.json` file defines one hook `main/hello`, and maps it to the action `handleHello`.

The `App.java` file defines the handler `handleHello`.

The handler first parses the payload, then replies with a hello-message, including the payload. 

## How to run it

Start the simulator in one terminal:
```sh
$ mm sim 3000
```

In another terminal call:
```sh
$ curl --silent -d "World" -H "Content-Type: text/plain" http://localhost:3000/rapids/hello
Hello, World!
```

## How to deploy it

First push the code, either through Git or with the command
```sh
$ mm deploy
```

If you don't have a key yet, make one now:
```sh
$ mm key
```

Now you can trigger using:
```sh
$ curl --silent -d "World" -H "Content-Type: text/plain" https://rapids.merrymake.io/[key]/hello
Hello, World!
```
