(defproject yehohanan7/avro-clj "0.3"
  :description "A Clojure Wrapper to Apache Avro to serialize/deserialize clojure map into avro byte array"
  :url "http://github.com/yehohanan7/avro-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.apache.avro/avro "1.7.3"]
                 [org.clojure/data.json "0.2.1"]]

  :source-paths ["src/main/clojure" "gen-java"]
  :test-paths ["src/test/clojure"]

  )
