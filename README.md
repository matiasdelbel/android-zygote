# Android Feature Project Template

## Description
In this repository you we'll find an Android template project with some basic configuration.

### Android Gradle Configuration
If you wish to change some default configuration for the android node of your module, like minimum sdk version or compile version, you can find their on the `gradle/module-android-config.gradle` file.

If you only want to change a particular property of the node, you can do it from your `module.gradle` file for example to change a particular property you can do `android.defaultConfig.applicationId = "com.mdelbel.android.features.template.testapp"`

### Dependencies
#### Unit-Testing
We provide some basic dependencies like jUnit or Mockito. You can find all on `gradle/dependencies-testing.gradle` file.