(ns pattern.triangle
  (:require [pattern.core :refer :all]))

(defn triangle [fn height symbols]
               (map fn (range 1 (inc height)) (cycle symbols)))

(defn filled-triangle
  [height symbol]
  (triangle repeat-symbol height [symbol]))

(defn empty-triangle
  [height symbol]
  (triangle empty-line height [symbol]))

(defn alternate-triangle
  [height symbol1 symbol2]
  (triangle repeat-symbol height [symbol1 symbol2]))