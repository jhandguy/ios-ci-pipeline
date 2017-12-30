pipelineJob("ios-submit-appstore") {
  description("Submit iOS App to Appstore")

  definition {
    cps {
      script(readFileFromWorkspace('submit-appstore/Jenkinsfile'))
    }
  }
}
