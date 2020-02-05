(ns pattern.triangle
  (:require [pattern.core :refer :all]))

(defn filled-triangle
  [height symbol]
  (loop [current-height 1 result []]
    (if (> current-height height)
        result
        (recur (inc current-height)
               (conj result (repeat-symbol current-height symbol))))))

(defn empty-triangle
  [height symbol]
  (loop [current-height 1 result []]
    (if (> current-height height)
        result
        (recur (inc current-height)
               (conj result (empty-line current-height symbol))))))

(defn alternate-triangle [height symbol1 symbol2]
  (loop [current-height 1 result [] symbols (cycle (vector symbol1 symbol2))]
    (if (> current-height height)
        result
        (recur (inc current-height)
               (conj result (repeat-symbol current-height (first symbols)))
               (rest symbols)))))
