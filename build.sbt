version := "0.0.1-SNAPSHOT"

val commonSettings = Seq(
  name := "kaska",
  scalaVersion := "2.12.10",
  libraryDependencies += "org.typelevel" %% "cats-core" % "2.1.0",
  libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.1" % "test",
  libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.0",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .aggregate(core, docs)

lazy val core = (project in file("kaska-core")).settings(commonSettings)

lazy val docs =
  (project in file("kaska-docs")) // important: it must not be docs/
    .dependsOn(core)
    .enablePlugins(MdocPlugin)

scalacOptions ++= Seq(
  "-encoding",
  "UTF-8", // source files are in UTF-8
  "-deprecation", // warn about use of deprecated APIs
  "-unchecked", // warn about unchecked type parameters
  "-feature", // warn about misused language features
  "-language:higherKinds", // allow higher kinded types without `import scala.language.higherKinds`
  "-Xlint", // enable handy linter warnings
  "-Xfatal-warnings", // turn compiler warnings into errors
  "-Ypartial-unification" // allow the compiler to unify type constructors of different arities
)
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")
