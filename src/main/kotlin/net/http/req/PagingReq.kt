@file:OptIn(ExperimentalSerializationApi::class)

package org.kotpot.cosmos.protocol.net.http.req

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber

@Serializable
abstract class PagingReq<T> {

    companion object {
        const val DEFAULT_SIZE = 30
        const val START_OFFSET = 0
    }

    @ProtoNumber(1)
    val size: Int = DEFAULT_SIZE

    @ProtoNumber(2)
    val offset: Int = START_OFFSET

    @ProtoNumber(3)
    val data: List<T> = emptyList()
}