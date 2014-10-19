(ns md.views.layout
	(:require [hiccup.core :refer :all])
	(:require [hiccup.page :refer [html5 include-css]]))

(defn home [& content]
	(html5 {:lang "pt-BR"}
		[:head
			[:meta {:charset "utf-8"}]
    	[:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
    	[:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]

			[:meta {:charset "utf-8"}]
    	[:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
    	[:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]

			[:title "Minhas Delícias - O seu caderninho de receitas em qualquer lugar"]]

			(include-css "https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
				           "/stylesheets/md.css"
                   "/stylesheets/font-awesome.min.css"
									 "http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic"
								   "http://fonts.googleapis.com/css?family=Montserrat:400,700")
			content))