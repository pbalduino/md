(defproject md "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.1"]
                 [ring/ring-anti-forgery "1.0.0"]
                 [prone "0.6.0"]
                 [compojure "1.1.9"]
                 [com.cemerick/friend "0.2.1"]
                 [friend-oauth2 "0.1.1"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler md.core/app})
