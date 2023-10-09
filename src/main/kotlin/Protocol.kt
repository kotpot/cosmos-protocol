package org.kotpot.cosmos.protocol

/**
 * Cosmos net transfer protocol root.
 * The protocol definition uses data class based on
 * [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization#using-the-plugins-block)
 */
enum class ProtocolType {
    /**
     * Protocol type used for http request data transmission.
     * Such as http request params and response body content.
     */
    Net,

    /**
     * Protocol type used for long connection information adn data carrier.
     */
    Signal
}