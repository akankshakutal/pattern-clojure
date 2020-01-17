(ns pattern.core-test
  (:require [clojure.test :refer :all]
            [pattern.core :refer :all]))

(deftest print-rectangle-test
  (testing "Filled Rectangle"
    (is (= [["X" "X"] ["X" "X"]] (filled-rectangle 2 2 "X"))))
  )

(deftest print-shape-test
  (testing "Print Shape"
    (is (= "**\n**\n**\n**\n**" (print-shape (filled-rectangle 2 5 "*") identity))))
  )

