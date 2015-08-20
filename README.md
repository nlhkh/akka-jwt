*akka-jwt* (based in [spray-jwt](https://github.com/kikuomax/spray-jwt)) is a set of utilities for [akka-http](http://doc.akka.io/docs/akka-stream-and-http-experimental/current/scala/http/), which perform signing and verification of a JSON Web Token (JWT).

Getting Started
===============

Add the following dependency to your `build.sbt`,

```
libraryDependencies += "com.github.witi83" %% "akka-jwt" % "0.1"
```

Example
=======

Please refer to [ExampleService](src/test/scala/com/github/witi83/akka/jwt/ExampleService.scala).

JWT Library
===========

[Nimbus JOSE + JWT](http://connect2id.com/products/nimbus-jose-jwt) is used for generating and verifying JWTs.

License
=======

[MIT License](http://opensource.org/licenses/MIT)
