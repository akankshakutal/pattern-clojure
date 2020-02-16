(ns pattern.core-test
  (:require [clojure.test :refer :all]
            [pattern.core :refer :all]))


(deftest empty-line-test
  (testing "Empty line"
    (is (= "X X" (bordered-line 3 "X")))))
