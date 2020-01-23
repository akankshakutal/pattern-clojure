(ns pattern.rectangle
  (:require [pattern.core :refer :all])
  )

(defn filled-rectangle
  [width height symbol]
  (rectangle  height (repeat-symbol width symbol))
  )

(defn empty-rectangle
  [width height symbol]
  (-> (rectangle  height (empty-line width symbol))
      (assoc 0 (repeat-symbol width symbol))
      (assoc (dec height) (repeat-symbol width symbol))
      ))

(defn alternate-rectangle
  [width height symbol1 symbol2]
  (-> (rectangle  height (alternate-symbol width symbol1 symbol2)))
  )
