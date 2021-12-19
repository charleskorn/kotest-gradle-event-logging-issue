# `./gradlew jvmTest`

```
$ ./gradlew jvmTest

> Configure project :
Kotlin Multiplatform Projects are an Alpha feature. See: https://kotlinlang.org/docs/reference/evolution/components-stability.html. To hide this message, add 'kotlin.mpp.stability.nowarn=true' to the Gradle properties.


> Task :jvmTest FAILED

MyTests[jvm] > test with no output[jvm] PASSED

MyTests[jvm] > test with stdout[jvm] STANDARD_OUT
    Hello stdout

MyTests[jvm] > test with stdout[jvm] PASSED

MyTests[jvm] > test that fails[jvm] FAILED
    io.kotest.assertions.AssertionFailedError: expected:<true> but was:<false>
        at app//MyTests$1$3.invokeSuspend(Test.kt:14)
        at app//MyTests$1$3.invoke(Test.kt)
        at app//MyTests$1$3.invoke(Test.kt)

3 tests completed, 1 failed

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':jvmTest'.
> There were failing tests. See the report at: file:///Users/charleskorn/Repositories/Personal/kotest-stdout-sterr/build/reports/tests/jvmTest/index.html

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.3.2/userguide/command_line_interface.html#sec:command_line_warnings
```

# `./gradlew macosArm64Test`

```
$ ./gradlew macosArm64Test

> Configure project :
Kotlin Multiplatform Projects are an Alpha feature. See: https://kotlinlang.org/docs/reference/evolution/components-stability.html. To hide this message, add 'kotlin.mpp.stability.nowarn=true' to the Gradle properties.


> Task :macosArm64Test FAILED

MyTests.test that fails FAILED
    io.kotest.assertions.AssertionFailedError at /opt/buildAgent/work/6326934d18cfe24e/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/Throwable.kt:24

3 tests completed, 1 failed

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':macosArm64Test'.
> There were failing tests. See the report at: file:///Users/charleskorn/Repositories/Personal/kotest-stdout-sterr/build/reports/tests/macosArm64Test/index.html

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.3.2/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 21s
3 actionable tasks: 3 executed
```
