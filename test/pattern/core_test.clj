(ns pattern.core-test
  (:require [clojure.test :refer :all]
            [pattern.core :refer :all]))

(deftest print-rectangle-test
  (testing "Rectangle"
    (is (= [["X" "X"] ["X" "X"]] (rectangle 2 2 "X" repeat-symbol))))
  )

(deftest print-shape-test
  (testing "Print Shape"
    (is (= "**\n**\n**\n**\n**" (print-shape (rectangle 2 5 "*" repeat-symbol) identity))))
  )


(deftest filled-rectangle-test
  (testing "Filled Rectangle"
    (is (= [["X" "X"] ["X" "X"]] (filled-rectangle 2 2 "X"))))
  )

(deftest empty-rectangle-test
  (testing "Filled Rectangle"
    (is (= [["*" "*" "*"] ["*" " " "*"] ["*" "*" "*"]] (empty-rectangle 3 3 "*"))))
  )
