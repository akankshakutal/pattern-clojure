(ns pattern.core)

(def repeat-symbol (comp (partial into []) repeat))

(def replace-first #(assoc %1 0 %2))

(def replace-last #(assoc %1 (dec (count %1)) %2))

(def flip-and-take #(vec (take %2 %1)))

(defn empty-line [times symbol]
  (-> (repeat-symbol times " ")
      (replace-first symbol)
      (replace-last symbol)
      (flip-and-take times)))

(defn print-shape
  [shape printer]
  (->> shape
       (map (partial apply str))
       (clojure.string/join "\n")
       (printer)))