(ns pattern.triangle-test
  (:require [clojure.test :refer :all])
  (:require [pattern.triangle :refer :all]))

(deftest triangle-test
  (testing "draw filled triangle with valid height"
    (is (= [["*"] ["*" "*"] ["*" "*" "*"]] (filled-triangle 3 "*"))))
  (testing "give empty list for 0 height"
    (is (= [] (filled-triangle 0 "*")))))

(deftest empty-triangle-test
  (testing "draw empty triangle with valid height"
    (is (= [["*"] ["*" "*"] ["*" " " "*"]] (empty-triangle 3 "*"))))
  (testing "give empty list for 0 height"
    (is (= [] (empty-triangle 0 "*")))))


(deftest alternate-triangle-test
  (testing "draw alternate triangle with valid height"
    (is (= [["*"] ["#" "#"] ["*" "*" "*"]] (alternate-triangle 3 "*" "#"))))
  (testing "give alternate list for 0 height"
    (is (= [] (alternate-triangle 0 "*" "#")))))
