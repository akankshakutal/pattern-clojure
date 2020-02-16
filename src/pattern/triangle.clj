(ns pattern.triangle
  (:require [pattern.core :refer :all]))

(defn triangle
  [fn height symbols]
  (map fn (range 1 (inc height)) (cycle symbols)))

(defn filled-triangle
  [height symbol]
  (triangle line height [symbol]))

(defn empty-triangle
  [height symbols]
  (concat (triangle bordered-line (dec height) symbols)
          [(line height symbols)]))

(defn alternate-triangle
  [height symbol1 symbol2]
  (triangle line height [symbol1 symbol2]))

(defn add-spaces
  [height symbol]
  (str (line (- height (count symbol)) " ") symbol))

(defn left-aligned-triangle
  [height symbol]
  (filled-triangle height symbol))

(defn right-aligned-triangle
  [height symbol]
  (map (partial add-spaces height) (filled-triangle height symbol)))