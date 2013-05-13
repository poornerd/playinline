import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "playinline"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.jsoup" % "jsoup" % "1.7.2",
    "commons-io" % "commons-io" % "2.4",
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
