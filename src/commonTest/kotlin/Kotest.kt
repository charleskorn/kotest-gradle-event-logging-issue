import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MyTests : StringSpec({
    "test with no output" {
        true shouldBe true
    }

    "test with stdout" {
        println("Hello stdout")
    }

    "test that fails" {
        false shouldBe true
    }
})

