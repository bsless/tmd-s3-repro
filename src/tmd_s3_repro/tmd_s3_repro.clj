(ns tmd-s3-repro.tmd-s3-repro
  (:require
   [cognitect.aws.client.api :as aws]
   ;[cognitect.aws.credentials :as cred]
   [tech.v3.dataset :as ds]))



(def client (aws/client {:api :s3}))

(aws/invoke client {:op :ListBuckets})
