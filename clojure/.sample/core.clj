(ns project.core)

(defn greet [name]
  (str "Hello, " name "!"))

(defn -main []
  (println (greet "World")))
