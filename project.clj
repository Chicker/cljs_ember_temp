(defproject z_crm "0.0.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"],
                 ;http://search.maven.org/ search text:  g:"org.clojure" AND a:"clojurescript"
                 [org.clojure/clojurescript "0.0-1909"],
                  ; JSON-lib
                 [cheshire "5.2.0"],
                ; Testing framework
                 [speclj "2.5.0"]]
  :plugins [[speclj "2.5.0"],
            [lein-cljsbuild "0.3.3"]]
  :test-paths ["spec/"]
  :jvm-opts ["-Dfile.encoding=utf-8"]

  :cljsbuild {
               :builds {
                         :server {:source-paths ["src/z_crm/server"]
                                  :compiler {:output-to "server.js"
                                           :target :nodejs
                                           :pretty-print true
                                           :optimizations :simple
                                           :static-fns true}},

                        :client { :source-paths ["src/z_crm/client/cljs"]
                                  :compiler {:output-to "build/application.js"
                                             :pretty-print true
                                             :optimizations :simple
                                             :static-fns true}}


                        }})
