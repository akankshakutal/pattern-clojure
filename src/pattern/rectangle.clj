(ns pattern.rectangle
  (:require [pattern.core :refer :all]))

(defn filled-rectangle
  [width height symbol]
  (repeat-pattern height (repeat-symbol width symbol)))

(defn empty-rectangle
  [width height symbol]
  (-> (repeat-pattern height (empty-line width symbol))
      (replace-first (repeat-symbol width symbol))
      (replace-last (repeat-symbol width symbol))))

(defn alternate-rectangle
  [width height symbol1 symbol2]
  (->> [(repeat-symbol width symbol1) (repeat-symbol width symbol2)]
       (cycle)
       (take height)))