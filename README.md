# Pentaho Shared Library

![](https://github.com/tmcsantos/pentaho-jenkins-shared-libraries/workflows/Build/badge.svg?branch=github-actions)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=tmcsantos_pentaho-jenkins-shared-libraries&metric=alert_status)](https://sonarcloud.io/dashboard?id=tmcsantos_pentaho-jenkins-shared-libraries)

This shared library serves the purpose of automating several repetitive pipeline definitions commonly used while building and testing Pentaho software. It allows the creation of a full execution pipeline based of a custom configuration file while maintaining an implementation as modular as possible, allowing only parts of the functionality to be leveraged when needed. 

For more information on what a Jenkins Shared Library is and how to set it up in your Jenkins environment please refer to [the oficial documentation](https://jenkins.io/doc/book/pipeline/shared-libraries/).

For the full usage information check the [Documentation page](https://pentaho.github.io/pentaho-jenkins-shared-library/).

# CPS Warning

@NonCPS annotated methods cannot call CPS transformed code!
Take that in consideration when annotating something with @NonCPS.
