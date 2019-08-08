# Android Feature Project Template

## Description
In this repository you we'll find an Android template project with some basic configuration.
We propose the clean architecture use so we provide 4 different package:
- Domain
- Use Cases
- Gateway
- Presentation

![modules diagram](https://www.draw.io/?lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Template%3A%20Modules#R7Vhbb9owFP41PFIlcQjwOKDtqmkSajdtfXSISawmceaYEvrrd%2BJL7qi0nVSqlYfW%2Fs7xsc%2F5Pl9ghJZJcc1xFn1nAYlHjhUUI7QaOY7tOhP4VyIHhXjzqQJCTgPtVAN39Ilo0NLojgYkbzkKxmJBsza4YWlKNqKFYc7Zvu22ZXF71gyHpAfcbXBs0ItJjf%2BigYg0bnvz2vCV0DDSk88cTxl8vHkIOdulesaUpURZEmzC6CzzCAds34DQ5QgtOWNCtZJiSeKysKZmZpw4mIWO0CISSQwdG5rSfHVksH3KYMiLk1Q0pzsaz5s6gee5LtrObeJPxnqCRxzvzASOF0OsRdaa1%2FuzKzNcJJiHNB2hL2C1sgL%2BylVYCh8Llimb27fFZCuU0W6OFKQQYxzTUEeVbtV80Ar1f7kq3wA%2FSJLFWBBjgJz9rjNgWY11CtmoYi44e6gkI5EIZ6VfUoTlZrnID3kSX2QgEynCJgXskfBtLCWxpVBstNhHVJA7cC4j7GE8YKVpyWLGAZLqQguIHFDgrQNvWSr05rJLtnVpVhtwJeC3iLFP4t%2BAIGd64bmDKjC0Eg7lbUBaFdeEJUTwA7ho60zLVO99pLfSvt5GnoMUFjV2kOtpR6w3b1hFrlUIDS3EE0Xp9ES5YgkG2XU5NDSVZ4WsjcC%2BoXFmqX614R0NrFlOBWVlTZUkB%2Fhv8DvEZo%2BTJr0jB23lZ4BMNVPD05If46kzs%2F8BociuzsNDm%2BIGp7Zn9TmdW2%2Bn9Onhamaz5Y33Lb%2B9vZn59%2F4tGs97tP7MYf9aS5zDvfF%2FcdsjcoDuF3BbXcLvRq5ZQIPdNSc5ZIQlIZ%2F0nkyva3cP43cnt%2F9MuIa7d48Pn7yezqtzfrz2b1p5JHc4JWnwpXygQ49lBKq8AKRZwwDnEQn6RJGCivKlYun2faO9KowiZO9g5FD21oRTyLDkUfmnkK0MBOee7t6bOcqODFZ5ymBVrxtMpUeC3reJ3m2bsx3fkOdvNAEPXGKGDj5m%2BpoY4pwTeNHSx%2Fa6hkjX4daMwoqPveEmTkc2Kh09qPkloRPHcZ8JpPLtBZISrFJ8gyrRh1Olc1ayNMd1U5fH9fupzZdo0%2F1w2pyelzats9PmtCMp77XaRM8EerU2oVv%2FwqTc69%2Fw0OVf)

### Kotlin Support
For that, we added the dependency on the general build.gradle file
```
dependencies {
        classpath plugin.kotlin
    }
```
And we also add some modification on each module, you can find it on the `kotlin-support.gradle` file.


### Android Gradle Configuration
If you wish to change some default configuration for the android node of your module, like minimum sdk version or compile version, you can find their on the `gradle/module-android-config.gradle` file.

If you only want to change a particular property of the node, you can do it from your `module.gradle` file for example to change a particular property you can do `android.defaultConfig.applicationId = "com.mdelbel.android.features.template.testapp"`

### Dependencies
#### Unit-Testing
We provide some basic dependencies like jUnit or Mockito. You can find all on `gradle/dependencies-testing.gradle` file.