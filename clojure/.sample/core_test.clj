(ns project.core-test
  (:require [clojure.test :refer :all]
            [project.core :refer :all]))

(deftest greet-test
  (testing "greet function"
    (is (= "Hello, Clojure!" (greet "Clojure")))))
