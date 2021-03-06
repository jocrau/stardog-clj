 ; Copyright (C) 2016-2017 Stardog Union
 ; Copyright (C) 2014-2015 Clark & Parsia
 ; Copyright (C) 2014 Paul Gearon
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

(defproject stardog-clj "5.0.2"
  :description "Stardog-clj: Clojure bindings for Stardog"
  :url "http://stardog.com"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.complexible.stardog/client-http "5.3.5" :extension "pom"]]
  :repositories [["stardog" "http://maven.stardog.com"]]
  :plugins [[jonase/eastwood "0.3.1"]]
  :profiles {:dev {:dependencies [[midje "1.9.3"]]
                   :plugins [[lein-midje "3.1.3"]]}})
