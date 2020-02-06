(ns pattern.rectangle
  (:require [pattern.core :refer :all]))

(defn filled-rectangle
  [width height symbol]
  (map #(repeat-symbol % symbol) (repeat width height)))

(defn empty-rectangle
  [width height symbol]
  (-> height
      (repeat-symbol (empty-line width symbol))
      (replace-first (repeat-symbol width symbol))
      (replace-last (repeat-symbol width symbol))
      (flip-and-take height)))

(defn alternate-rectangle
  [width height symbol1 symbol2]
  (->> [symbol1 symbol2]
       (map (partial repeat-symbol width))
       (cycle)
       (take height)))