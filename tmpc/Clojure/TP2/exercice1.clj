#!/usr/bin/env clojure

;; Fibonacci function
(defn threadJob [n]
    (Thread/sleep (rand 50))
    (println "Thread " n))

(dotimes [i 1000]
    (future (threadJob i)))

;; Exit program
(System/exit 0)