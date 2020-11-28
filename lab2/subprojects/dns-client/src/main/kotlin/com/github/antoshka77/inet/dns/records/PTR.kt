package com.github.antoshka77.inet.dns.records

import com.github.antoshka77.inet.dns.DNSDecoder
import com.github.antoshka77.inet.dns.Record
import com.github.antoshka77.inet.dns.RecordFactory
import com.google.auto.service.AutoService
import kotlinx.serialization.Serializable

@Serializable
class PTR(val pointer: String) : Record() {
    @AutoService(RecordFactory::class)
    companion object : RecordFactory(12, "PTR") {
        override fun decode(decoder: DNSDecoder) = PTR(decoder.decodeName())
    }
}
