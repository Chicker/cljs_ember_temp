(ns z-crm.client.cljs.app)

(def application (aget js/Ember "Application"))

(def App (.create application {"LOG_TRANSITIONS" true,
                               "LOG_ACTIVE_GENERATION" true,
                               "LOG_VIEW_LOOKUPS" true}))
