pipelineJob("ios-submit-appstore") {
  description("Submit iOS App to Appstore 2")

  definition {
    cps {
      script(readFileFromWorkspace('pipelines/submit_appstore.groovy'))
      sandbox()
    }
  }
}
