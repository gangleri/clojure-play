(ns infinite-even.core
  (:gen-class))

;; (defn even-numbers
;;   ([] (even-numbers 0))
;;   ([n] (cons n(lazy-seq(even-numbers(+ n 2)))))

(defn even-numbers 
  ([] (even-numbers 0)) 
  ([n] (cons n (lazy-seq (even-numbers (+ n 2))))))

(defn -main
  [& args]
  (def a (take 10(even-numbers)))
  (println a))
