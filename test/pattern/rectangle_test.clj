(ns pattern.rectangle-test
  (:require [clojure.test :refer :all])
  (:require [pattern.rectangle :refer :all]))

(deftest filled-rectangle-test
  (testing "Filled Rectangle"
    (is (= '("XX" "XX") (filled-rectangle 2 2 "X"))))
  )

(deftest empty-rectangle-test
  (testing "Empty Rectangle"
    (is (= ["***" "* *" "***"] (empty-rectangle 3 3 "*"))))
  )

(deftest alternate-rectangle-test
  (testing "Filled Rectangle"
    (is (= ["XXX" "   " "XXX"] (alternate-rectangle 3 3 "X" " "))))
  )
