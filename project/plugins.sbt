addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += Resolver.bintrayIvyRepo("s22s", "sbt-plugins")

addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.7-astraea.1")

//addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")
