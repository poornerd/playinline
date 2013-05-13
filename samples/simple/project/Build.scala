import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "simple"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
      "com.poornerd" % "playinline_2.10" % "1.0-SNAPSHOT",
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
      resolvers += Resolver.url("My Github", url("http://poornerd.github.com/releases/"))(Resolver.ivyStylePatterns)
  )

}
