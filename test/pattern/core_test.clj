(ns pattern.core-test
  (:require [clojure.test :refer :all]
            [pattern.core :refer :all]))


(deftest empty-line-test
  (testing "Empty line"
    (is (= ["X" " " "X"] (empty-line 3 "X")))
    )
  )
