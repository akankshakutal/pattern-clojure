(ns pattern.core)

(defn repeat-symbol [times symbol] (into [] (repeat times symbol)))

(defn rectangle
  [height pattern]
  (loop [height height result []]
    (if (zero? height)
      result
      (recur (dec height) (conj result pattern))
      )
    ))

(defn empty-line [times symbol]
  (let [result (assoc (repeat-symbol times " ") 0 symbol)
        last-index (dec (count result))]
    (assoc result last-index symbol)
    ))

(defn alternate-symbol
  [width symbol1 symbol2]
  (->> [symbol1 symbol2]
       (repeat width)
       (flatten)
       (take width)
       (vec)
       ))


(defn print-shape
  [shape printer]
  (->> shape
       (map #(clojure.string/join "" %1))
       (clojure.string/join "\n")
       (printer))
  )