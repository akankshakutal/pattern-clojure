(ns pattern.core)

(defn repeat-symbol [times symbol] (into [] (repeat times symbol)))

(defn filled-rectangle
  [width height symbol]
  (loop [height height result []]
    (if (zero? height)
      result
      (recur (dec height)
             (conj result (repeat-symbol width symbol)))
      )
    ))

(defn print-shape
  [shape printer]
  (->> shape
       (map #(clojure.string/join "" %1))
       (clojure.string/join "\n")
       (printer))
  )