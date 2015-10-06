name := "akka-sample-project"

version := "1.0"

ideaExcludeFolders += ".idea"

ideaExcludeFolders += ".idea_modules"

scalaVersion := "2.10.1"

mainClass in (Compile,run) := Some("TestAkka.Main")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor"   % "2.2-M3",
  "com.typesafe.akka" %% "akka-slf4j"   % "2.2-M3",
  "com.typesafe.akka" %% "akka-remote"  % "2.2-M3",
  "com.typesafe.akka" %% "akka-agent"   % "2.2-M3",
  "com.typesafe.akka" %% "akka-testkit" % "2.2-M3" % "test"
)