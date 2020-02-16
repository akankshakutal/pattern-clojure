(ns pattern.core)

(def line (comp (partial apply str) repeat))

(defn bordered-line
  [times symbol]
  (condp = times
    0 ""
    1 (str symbol)
    (str symbol (line (- times 2) " ") symbol)))

(defn print-shape
  [shape printer]
  (->> shape
       (clojure.string/join "\n")
       (printer)))