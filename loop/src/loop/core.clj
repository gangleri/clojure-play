(ns loop.core
  (:gen-class))

(defn -main
  [& args]
  (loop [iteration 0]
        (println (str iteration))
        (if (> iteration 3)
          (println "bye")
          (recur (inc iteration)))))
