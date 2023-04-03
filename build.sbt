ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "MultimoduleProject"
  ).aggregate(mod1,mod2)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test

lazy val mod1 = (project in file("Module1")).settings(
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
)

lazy val mod2 = (project in file("Module2")).settings(
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
).dependsOn(mod1)

lazy val mod3 = (project in file("Module3")).settings(
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
).dependsOn(mod1,mod2)