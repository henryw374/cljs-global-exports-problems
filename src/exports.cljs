(ns exports
  (:require [my.foreignlib :as lib]))

(def foo-ref (str "test: " lib/foo))

(println "loaded? " lib/foo)

(defn say-hello []
  (println "hello " lib/foo))
