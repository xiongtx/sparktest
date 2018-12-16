(defproject sparktest "0.1.0-SNAPSHOT"
  :description "Experiments with Apache Spark"
  :url "https://github.com/xiongtx/sparktest"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [yieldbot/flambo "0.8.2"]]
  :main sparktest.core
  :profiles {:dev {:aot [sparktest.core]}
             :provided {:dependencies [[org.apache.spark/spark-core_2.11 "2.4.0"]]}
             :uberjar {:aot :all}})
