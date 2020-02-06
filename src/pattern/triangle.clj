(ns pattern.triangle
  (:require [pattern.core :refer :all]))

(defn filled-triangle
  [height symbol]
  (map #(repeat-symbol % symbol) (range 1 (inc height))))

(defn empty-triangle
  [height symbol]
  (map #(empty-line % symbol) (range 1 (inc height))))

(defn alternate-triangle
  [height symbol1 symbol2]
  (map repeat-symbol (range 1 (inc height)) (cycle [symbol1 symbol2])))