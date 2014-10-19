(ns md.core
	(:require [compojure.core :refer :all]
						[compojure.route :as route]
		        [prone.middleware :as prone]
		        [ring.middleware.anti-forgery :as af]
     				[ring.middleware.session :refer :all]
     				[md.views.root :as root]
     				[md.views.layout :as layout]))

(defroutes handler
	(GET "/" []
  	root/index)
	(route/resources "/")
  (route/not-found "Volte amanhã"))

(def app
	(cond-> handler
					af/wrap-anti-forgery
      		wrap-session))
