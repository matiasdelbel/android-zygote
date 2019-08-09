# Zygote for an Android Project

## Prerequisites
1- Have an account on Github
2- Have an account on Travis-CI associated with your Github user.
3- Have an account on CodeCov associated with your Github user.

## How to use it?
1- Click the `Use this template` button and complete the flow until you create a new repository from this project.
2- Turn on your project on Travis `https://travis-ci.org/<User>/<project-name>/settings`
3- `Find & Replace` `com.mdelbel.android.zygote` to rename the current project's package name to yours.
4- Push changes in the repository that you've just created (do not forget of change this README).

## What will you find on this zygote?
Here you'll find an Android template project with some basic configuration.

The project is divided into 5 modules: The main app and 4 libraries: domain, use cases, repository, and presentation.
Each module represents a layer on the Clean Architecture model, and have an only responsibility:
- Domain: In here you have to put your business objects.
- Use Cases: Represent actions that the app can execute against your business.
- Gateway: To obtain and share data with another application.
- Presentation: Determine how to present your business objects.

![modules diagram](https://www.draw.io/?lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Template%3A%20Modules#R7Vhbb9owFP41PFIlcQjwOKDtqmkSajdtfXSISawmceaYEvrrd%2BJL7qi0nVSqlYfW%2Fs7xsc%2F5Pl9ghJZJcc1xFn1nAYlHjhUUI7QaOY7tOhP4VyIHhXjzqQJCTgPtVAN39Ilo0NLojgYkbzkKxmJBsza4YWlKNqKFYc7Zvu22ZXF71gyHpAfcbXBs0ItJjf%2BigYg0bnvz2vCV0DDSk88cTxl8vHkIOdulesaUpURZEmzC6CzzCAds34DQ5QgtOWNCtZJiSeKysKZmZpw4mIWO0CISSQwdG5rSfHVksH3KYMiLk1Q0pzsaz5s6gee5LtrObeJPxnqCRxzvzASOF0OsRdaa1%2FuzKzNcJJiHNB2hL2C1sgL%2BylVYCh8Llimb27fFZCuU0W6OFKQQYxzTUEeVbtV80Ar1f7kq3wA%2FSJLFWBBjgJz9rjNgWY11CtmoYi44e6gkI5EIZ6VfUoTlZrnID3kSX2QgEynCJgXskfBtLCWxpVBstNhHVJA7cC4j7GE8YKVpyWLGAZLqQguIHFDgrQNvWSr05rJLtnVpVhtwJeC3iLFP4t%2BAIGd64bmDKjC0Eg7lbUBaFdeEJUTwA7ho60zLVO99pLfSvt5GnoMUFjV2kOtpR6w3b1hFrlUIDS3EE0Xp9ES5YgkG2XU5NDSVZ4WsjcC%2BoXFmqX614R0NrFlOBWVlTZUkB%2Fhv8DvEZo%2BTJr0jB23lZ4BMNVPD05If46kzs%2F8BociuzsNDm%2BIGp7Zn9TmdW2%2Bn9Onhamaz5Y33Lb%2B9vZn59%2F4tGs97tP7MYf9aS5zDvfF%2FcdsjcoDuF3BbXcLvRq5ZQIPdNSc5ZIQlIZ%2F0nkyva3cP43cnt%2F9MuIa7d48Pn7yezqtzfrz2b1p5JHc4JWnwpXygQ49lBKq8AKRZwwDnEQn6RJGCivKlYun2faO9KowiZO9g5FD21oRTyLDkUfmnkK0MBOee7t6bOcqODFZ5ymBVrxtMpUeC3reJ3m2bsx3fkOdvNAEPXGKGDj5m%2BpoY4pwTeNHSx%2Fa6hkjX4daMwoqPveEmTkc2Kh09qPkloRPHcZ8JpPLtBZISrFJ8gyrRh1Olc1ayNMd1U5fH9fupzZdo0%2F1w2pyelzats9PmtCMp77XaRM8EerU2oVv%2FwqTc69%2Fw0OVf)

All of the module have Kotlin support. It is important to notice, that `domain` is a pure kotlin module.

Also, this project has a basic configuration with Travis, so when you turn on your project on the CI, we automatic start to create reports.
We run some static code analyzer tools, like kLint. Also, we run all the set of test and post it coverage on CodeCov.
Do not forget to update this README with your badge from TravisCI and CodeCov