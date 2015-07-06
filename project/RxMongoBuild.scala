/**********************************************************************************************************************
 * This file is part of Scrupal, a Scalable Reactive Web Application Framework for Content Management                 *
 *                                                                                                                    *
 * Copyright (c) 2015, Reactific Software LLC. All Rights Reserved.                                                   *
 *                                                                                                                    *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     *
 * with the License. You may obtain a copy of the License at                                                          *
 *                                                                                                                    *
 *     http://www.apache.org/licenses/LICENSE-2.0                                                                     *
 *                                                                                                                    *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   *
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  *
 * the specific language governing permissions and limitations under the License.                                     *
 **********************************************************************************************************************/

import play.sbt.PlayLayoutPlugin
import sbt.Keys._
import sbt._
import scoverage.ScoverageSbtPlugin
import scrupal.sbt.ScrupalPlugin
import scrupal.sbt.ScrupalPlugin.autoImport._

object ScrupalBuild extends Build {

  lazy val dependencies = Seq( "org.scrupal" %% "scrupal-storage" % "0.2.0-SNAPSHOT" )

  lazy val store_rxmongo_proj = Project("scrupal-store-rxmongo", file("."))
    .enablePlugins(ScrupalPlugin)
    .disablePlugins(PlayLayoutPlugin)
    .settings(
      organization := "org.scrupal",
      version := "0.2.0-SNAPSHOT",
      maxErrors := 50,
      ScoverageSbtPlugin.ScoverageKeys.coverageFailOnMinimum := true,
      scrupalCopyrightHolder := "Reactific Software LLC",
      scrupalCopyrightYears := Seq(2015),
      scrupalDeveloperUrl := url("http://reactific.com/"),
      scrupalTitle := "Scrupal Store For RxMongo",
      scrupalPackage := "scrupal.store.rxmongo",
      libraryDependencies ++= dependencies
    )
}
