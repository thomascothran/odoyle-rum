(ns odoyle-frame.start
  (:require [odoyle-frame.core :as c]
            [rum.core :as rum]))

(rum/mount (c/app) (js/document.querySelector "#app"))
