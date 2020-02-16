(ns pattern.rectangle
  (:require [pattern.core :refer :all]))

(defn middle-lines [width height symbol]
                   (repeat height (bordered-line width symbol)))

(defn filled-rectangle
  [width height symbol]
  (repeat height (line width symbol)))

(defn empty-rectangle
  [width height symbol]
  (concat [(line width symbol)]
          (middle-lines width (dec (dec height)) symbol)
          [(line width symbol)]))

(defn alternate-rectangle
  [width height symbol1 symbol2]
  (->> [symbol1 symbol2]
       (map (partial line width))
       (cycle)
       (take height)))