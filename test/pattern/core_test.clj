(ns pattern.core-test
  (:require [clojure.test :refer :all]
            [pattern.core :refer :all]))

(deftest rectangle-test
  (testing "Rectangle"
    (is (= [["X" "X"] ["X" "X"]] (repeat-pattern 2 (repeat-symbol 2 "X")))))
  )

(deftest print-shape-test
  (testing "Print Shape"
    (is (= "**\n**\n**\n**\n**"
           (print-shape (repeat-pattern 5 (repeat-symbol 2 "*")) identity))))
  )

(deftest empty-line-test
  (testing "Empty line"
    (is (= ["X" " " "X"] (empty-line 3 "X")))
    )
  )
