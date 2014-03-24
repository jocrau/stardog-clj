 ; Copyright (C) 2014 Clark & Parsia
 ;
 ; Licensed under the Apache License, Version 2.0 (the "License");
 ; you may not use this file except in compliance with the License.
 ; You may obtain a copy of the License at
 ;
 ;      http://www.apache.org/licenses/LICENSE-2.0
 ;
 ; Unless required by applicable law or agreed to in writing, software
 ; distributed under the License is distributed on an "AS IS" BASIS,
 ; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ; See the License for the specific language governing permissions and
 ; limitations under the License.

(defproject stardog-clj "0.1.0-SNAPSHOT"
  :description "Stardog-clj: Clojure bindings for Stardog"
  :url "http://stardog.com"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.complexible.stardog.protocols.snarl/client "2.1.2"]
                 [com.complexible.stardog/common-rdf "2.1.2"]
                 [com.complexible.stardog/openrdf-utils "2.1.2"]
                 [com.complexible.stardog/shared "2.1.2"]
                 [org.openrdf.sesame/sesame "2.7.7"]
                 [com.complexible.stardog/api "2.1.2"]]
  :plugins [[jonase/eastwood "0.0.2"]
            [lein-midje "3.1.3-RC2"]]
  :profiles
  {:dev
   {:dependencies
    [
     [midje "1.6-beta1"]
    ]}})
