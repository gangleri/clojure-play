(ns decmaker.core
  (:gen-class))

(defn decmaker
  [dec-by]
  #(- % dec-by))

(def decBy5 (decmaker 5))

(defn -main
  [& args]
  (println (decBy5 55)))
