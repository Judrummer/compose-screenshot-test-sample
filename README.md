## Compose Screenshot test sample
A sample project that automatically generates screenshot tests by utilizing the detection of the @Preview annotation
through the use of three libraries below.

[Showkase](https://github.com/airbnb/Showkase) for detect `@Preview` annotation  
[Paparazzi](https://github.com/cashapp/paparazzi) for screenshot testing  
[TestParameterInjector](https://github.com/google/TestParameterInjector) for inject test parameter

## Record command

`./gradlew recordPaparazziDebug`

## Verify command

`./gradlew verifyPaparazziDebug`
