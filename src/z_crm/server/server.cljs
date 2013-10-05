(ns z-crm.server.server
  (:require [cljs.nodejs :as node]))

(def express (node/require "express"))
(def consolid (node/require "consolidate"))

(def srv (express))

(defn -main [& args]
  (-> srv
    (.engine "html" (aget consolid "handlebars"))
    (.set "views engine" "html")
    (.set "views" "build")
    (.use (.logger express))
    (.get "/"
          (fn [req, res]
            (.render res "index.html")))
    (.use "/" ((aget express "static") "build/"))
    (.listen 3000)))

(set! *main-cli-fn* -main)



