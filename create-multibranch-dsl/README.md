# Description

This pipeline creates a Jenkins GitLab Multibranch job using Groovy Domain-Specific Language (DSL) under a specific folder

# Pre-requisites

- [Job DSL plugin](https://wiki.jenkins.io/display/JENKINS/Job+DSL+Plugin)

# Instructions

- Create a new clean `Freestyle project` job 
- Select `Process Job DSLs` in the `Build` section
- Select `Use the provided DSL script` 
- Copy the content to `DSL script` textbox modifying the `#` variables
- It is also possible to clone this repo, select `Look on Filesystem` and include the path to the `groovy` file

# External resources

- [Jenkins Job DSL API Viewer](https://jenkinsci.github.io/job-dsl-plugin/)
- [multibranchPipelineJob documentation](https://jenkinsci.github.io/job-dsl-plugin/#path/multibranchPipelineJob)

# License

Apache 2.0