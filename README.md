# Zygote for an Android Project

## Prerequisites
- Have an account on Github
- Have an account on Travis-CI associated with your Github user.
- Have an account on CodeCov associated with your Github user.

## How to use it?
- Click the `Use this template` button and complete the flow until you create a new repository from this project.
- Turn on your project on Travis `https://travis-ci.org/<User>/<project-name>/settings`
- Change the package name on the Android manifest of app, gateway, presentation and use cases modules.
Also, do not forget to rename the `applicationId` on the `build.gradle` file on the app module
- Push changes in the repository that you've just created (do not forget of change this README).

### CodeCov
Modify the `codecov.yml` file to update the code coverage report.

## What will you find on this zygote?
Here you'll find an Android template project with some basic configuration.

The project is divided into 5 modules: The main app and 4 libraries: domain, use cases, repository, and presentation.
Each module represents a layer on the Clean Architecture model, and have an only responsibility:
- Domain: In here you have to put your business objects.
- Use Cases: Represent actions that the app can execute against your business.
- Gateway: To obtain and share data with another application.
- Presentation: Determine how to present your business objects.

All of the module have Kotlin support. It is important to notice, that `domain` is a pure kotlin module.

Also, this project has a basic configuration with Travis, so when you turn on your project on the CI, we automatic start to create reports.
We run some static code analyzer tools, like kLint. Also, we run all the set of test and post it coverage on CodeCov.
Do not forget to update this README with your badge from TravisCI and CodeCov
