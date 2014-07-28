name := "app"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
 "com.squareup.dagger" % "dagger" % "1.2.2",
 "com.squareup.dagger" % "dagger-compiler" % "1.2.2"
)

play.Project.playJavaSettings
