
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

object NetworkDriver {
    init {
        println("Init : $this")
    }

    fun logger() : NetworkDriver = apply { println("Network driver : $this") }
}

class SingletonTest  {
    @Test
    fun testSingleton () {
        println("Start")
        val networkDriver1 = NetworkDriver.logger()
        val networkDriver2 = NetworkDriver.logger()

        Assertions.assertThat(networkDriver1).isSameAs(NetworkDriver)
        Assertions.assertThat(networkDriver2).isSameAs(NetworkDriver)
    }
}