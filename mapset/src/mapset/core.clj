(ns mapset.core
  (:gen-class))

(defn mapset
  [f c]
  (set (map f c)))

(defn -main
  [& args]
  (println (mapset inc [1, 2, 3])))
