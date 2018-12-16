(ns sparktest.core
  (:require [flambo.api :as f]
            [flambo.conf :as conf])
  (:gen-class))


(def context (-> (conf/spark-conf)
                 (conf/master "spark://txx.attlocal.net:7077")
                 (conf/app-name "sparktest")))

(def sc (f/spark-context context))

(defn -main
  [& _]
  (-> (f/parallelize sc (range 100))
      (f/map (f/fn [x] (inc x)))
      f/count))

