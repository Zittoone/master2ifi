#!/usr/bin/env clojure

(def a (agent 0))

(defn threadJob [n]
    (Thread/sleep (rand-int 50))
    (send a (fn [i] (println "Thread " i) n)))

(dotimes [i 1000]
    (future (threadJob i)))

(await a)

;; Exit program
(System/exit 0)