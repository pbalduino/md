(ns md.views.root
  (:require [ring.util.anti-forgery :refer :all]
  					[md.views.layout :as layout]
  					[hiccup.page :refer [include-js]]))

(defn index [& args]
	(layout/home
		[:body {:id "page-top"
		        :data-spy "scroll"
		        :data-target ".navbar-fixed-top"}
	
			[:nav {:class "navbar navbar-custom navbar-fixed-top" 
			       :role "navigation"}
		    [:div {:class "container"}
		    	[:div {:class "navbar-header"}
		      	[:button {:type "button" 
		      	          :class "navbar-toggle"
		      	          :data-toggle "collapse"
		      	          :data-target ".navbar-main-collapse"}
		        	[:i {:class "fa fa-bars"}]]
		        [:a {:class "navbar-brand page-scroll" 
		             :href "#page-top"}
		        	[:i {:class "fa fa-play-circle"}]
		        	[:span {:class "light"}
		        		"Início"]]]

		      [:div {:class "collapse navbar-collapse navbar-right navbar-main-collapse"}
		      	[:ul {:class "nav navbar-nav"}
		          [:li {:class "hidden"}
		          	[:a {:href "#page-top"}]]

		          [:li {:class "page-scroll"}
		          	[:a {:href "#about"} "O que é"]]

		          [:li {:class "page-scroll"}
		          	[:a {:href "#signup"} "Cadastre-se"]]

		          [:li
		          	[:a {:href "/signin"} "Entre"]]]]]]

	    [:header {:class "intro"}
	    	[:div {:class "intro-body"}
	      	[:div {:class "container"}
	        	[:div {:class "row"}
	          	[:div {:class "col-md-8 col-md-offset-2"}
	            	[:h1 {:class "brand-heading"} "Minhas delícias"]
	              [:p {:class "intro-text"} "O seu caderno de receitas em qualquer lugar, a qualquer hora."]
	              [:a {:href "#about" :class "btn btn-circle page-scroll"}
	              	[:i {:class "fa fa-angle-double-down animated"}]]]]]]]

    	[:section {:id "about"
    	           :class "container content-section text-center"}
      	[:div {:class "row"}
        	[:div {:class "col-lg-8 col-lg-offset-2"}
          	[:h2 "Para que serve?"]
            [:p "Sabe aquele seu caderno de receitas que está velhinho, soltando as folhas e juntando poeira? Que tal se você pudesse ter todas as receitas dele ao alcance da mão, em qualquer lugar?"]
            [:img {:src "images/caderno.jpg" 
                   :class "img-responsive center-block"}]
            [:p "O " [:a {:href "/"} "Minhas delícias"] " é esse lugar, sem avaliação, sem críticas, e você só compartilha a receita se quiser."]]]]

    	[:section {:id "signup" 
    	           :class "content-section text-center"}
      	[:div {:class "signup-section"}
        	[:div {:class "container"}
          	[:div {:class "col-lg-8 col-lg-offset-2"}
            	[:h2 "Cadastre-se"]
              [:p "O " [:i "Minhas Delícias"] "ainda está em desenvolvimento. Cadastre-se e nós avisaremos quando o site estiver pronto."]
              [:a {:href "/signup"
                   :class "btn btn-default btn-lg"} "Cadastre-se para o Beta"]]]]]
  	[:footer
      	[:div {:class "container text-center"}
        	[:p "Copyright &copy; Minhas Delícias 2014"]]]

			(include-js "/javascripts/jquery-1.11.0.js"
				          "/javascripts/bootstrap.min.js"
				          "/javascripts/jquery.easing.min.js"
				          "/javascripts/grayscale.js")]))