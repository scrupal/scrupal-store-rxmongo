resolvers ++=  Seq( Resolver.sonatypeRepo("releases"), Resolver.sonatypeRepo("snapshots") )

addSbtPlugin("org.scrupal" % "scrupal-sbt" % "0.2.0-SNAPSHOT" )

