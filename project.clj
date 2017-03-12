(defproject tensorflow-protobuf "r1.0"
  :description "Java Protocol Buffers for Tensorflow"
  :url "http://github.com/bpoweski/tensorflow-protobuf"
  :license {:name "Apache License"
            :url  "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[com.google.protobuf/protobuf-java "3.2.0"]]
  :plugins [[lein-protobuf-minimal "0.4.4"]]
  :proto-paths ["tensorflow/"])
