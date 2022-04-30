name := "zio-intro"

scalaVersion := "3.1.2"

val zioVersion = "2.0.0-RC5"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"          % zioVersion,
  "dev.zio" %% "zio-test"     % zioVersion,

  "dev.zio" %% "zio-test-sbt" % zioVersion % Test,
)

testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
