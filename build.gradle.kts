import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    kotlin("multiplatform") version "1.6.0"
    id("io.kotest.multiplatform") version "5.0.2"
}

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }


    macosX64()
    macosArm64()

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation("io.kotest:kotest-framework-engine:5.0.3")
                implementation("io.kotest:kotest-assertions-core:5.0.3")
                implementation(kotlin("test"))
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation("io.kotest:kotest-runner-junit5:5.0.3")
            }
        }
    }
}

tasks.named<Test>("jvmTest") {
    useJUnitPlatform()
}

tasks.withType<Test>() {
    testLogging {
        events(TestLogEvent.FAILED, TestLogEvent.SKIPPED, TestLogEvent.PASSED, TestLogEvent.STANDARD_OUT, TestLogEvent.STANDARD_ERROR)
        showExceptions = true
        showStackTraces = true
        showCauses = true
        exceptionFormat = TestExceptionFormat.FULL
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
