pipelineJob("ios-submit-appstore") {
  description("Submit iOS App to Appstore")

  definition {
    cps {
      script(readFileFromWorkspace('pipelines/submit_appstore.groovy'))
      sandbox()
    }
  }
}
