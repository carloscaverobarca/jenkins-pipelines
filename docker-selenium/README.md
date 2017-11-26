# Description

This pipeline executes Selenium tests against Chrome and Firefox, all running in the docker containers but in separate containers and in parallel

# Pre-requisites

- [Docker Pipeline plugin](https://wiki.jenkins.io/display/JENKINS/Docker+Pipeline+Plugin)

# Instructions

- Create a new `Pipeline` job and configure your `SCM` repository containing the Jenkinsfile.

# External resources

- [Pipeline example for Jenkins Kubernetes Plugin](https://github.com/carlossg/jenkins-kubernetes-plugin/blob/master/examples/selenium.groovy)
- [Selenium example](https://github.com/carlossg/selenium-example)

# License

Apache 2.0