(ns pattern.core)

(defn repeat-symbol [times symbol] (into [] (repeat times symbol)))

(defn rectangle
  [width height symbol pattern]
  (loop [height height result []]
    (if (zero? height)
      result
      (recur (dec height)
             (conj result (pattern width symbol)))
      )
    ))

(defn empty-line [times symbol]
  (let [result (assoc (repeat-symbol times " ") 0 symbol)
        last-index (dec (count result))]
    (assoc result last-index symbol)
    ))

(defn filled-rectangle
  [width height symbol]
  (rectangle width height symbol repeat-symbol)
  )

(defn empty-rectangle
  [width height symbol]
  (-> (rectangle width height symbol empty-line)
      (assoc 0 (repeat-symbol width symbol))
      (assoc (dec height) (repeat-symbol width symbol))
      ))

(defn print-shape
  [shape printer]
  (->> shape
       (map #(clojure.string/join "" %1))
       (clojure.string/join "\n")
       (printer))
  )