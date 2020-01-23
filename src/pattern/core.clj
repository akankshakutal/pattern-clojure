(ns pattern.core)

(defn repeat-symbol
  [times symbol]
  (into [] (repeat times symbol)))

(defn replace-first
  [list value]
  (assoc list 0 value))

(defn replace-last
  [list value]
  (assoc list (dec (count list)) value))

(defn repeat-pattern
  [times pattern]
  (loop [times times result []]
    (if (zero? times)
      result
      (recur (dec times) (conj result pattern)))))

(defn empty-line [times symbol]
  (-> (repeat-symbol times " ")
      (replace-first symbol)
      (replace-last symbol)))

(defn print-shape
  [shape printer]
  (->> shape
       (map (partial apply str))
       (clojure.string/join "\n")
       (printer)))