(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (> x 0)
    x
    (- x)))

(defn divides? [divisor n]
  (if (== (mod n divisor)
         0)
    true
    false
    ))

(defn fizzbuzz [n]
  (cond
    (and
      (divides? 3 n)
      (divides? 5 n)) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    ))

(defn teen? [age]
  (if (> age 12)
    (if (< age 20)
      true
      false)
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true
    ))

(defn leap-year? [year]
  (if
    (divides? 4 year)
    (if (not (divides? 100 year))
      true
      (if (divides? 400 year)
        true
        false))
    false))

; '_______'
