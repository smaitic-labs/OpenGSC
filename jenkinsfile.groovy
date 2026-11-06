@Library("jenkins-library") _

dockerImagePipeline(
    script: this,
    app: "opengsc",
    service: "opengsc",
    dockerfile: "Dockerfile",
    mainBranch: "main",
    cluster: "svpl-engineering",
    k8sDeploy: false,
    slackChannel: "#devops"
)
