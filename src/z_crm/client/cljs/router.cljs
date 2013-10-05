(ns z-crm.client.cljs.router
  (:use [z-crm.client.cljs.app :only [App]]))

(def router (aget App "Router") )

(.map router (fn []
               (.route (js* "this") "products" {:path "/products"})
               (.route (js* "this") "clients" {:path "/clients"})))
               ;(this-as this
               ;         (.route this "products" {:path "/products"})
               ;         (.route this "clients" {:path "/clients"}))))
