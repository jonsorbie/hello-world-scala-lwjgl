ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "hello-world-scala-lwjgl"
  )

// This build.sbt pulls in libraries specific to macos.
// Change it according to your platform, of course.
// Use the https://www.lwjgl.org/customize tool to help figure out what you really need.

val lwjglVersion = "3.3.6"
val lwjglNatives = "natives-macos-arm64"

libraryDependencies ++= Seq(
    "org.lwjgl" % "lwjgl"        % lwjglVersion,
    "org.lwjgl" % "lwjgl-glfw"   % lwjglVersion,
    "org.lwjgl" % "lwjgl-opengl" % lwjglVersion,
    "org.lwjgl" % "lwjgl"        % lwjglVersion classifier lwjglNatives,
    "org.lwjgl" % "lwjgl-glfw"   % lwjglVersion classifier lwjglNatives,
    "org.lwjgl" % "lwjgl-opengl" % lwjglVersion classifier lwjglNatives
)
