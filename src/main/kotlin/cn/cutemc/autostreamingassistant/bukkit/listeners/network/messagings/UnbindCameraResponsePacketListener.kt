package cn.cutemc.autostreamingassistant.bukkit.listeners.network.messagings

import cn.cutemc.autostreamingassistant.bukkit.network.UnbindCameraResponsePacket
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.bukkit.entity.Player
import org.bukkit.plugin.messaging.PluginMessageListener
import java.util.*

object UnbindCameraResponsePacketListener : PluginMessageListener {

    val listeners = mutableMapOf<UUID, (UnbindCameraResponsePacket) -> Unit>()
    override fun onPluginMessageReceived(channel: String, player: Player, message: ByteArray) {
        val jackson = jacksonObjectMapper()
        val packet: UnbindCameraResponsePacket = jackson.readValue(message, UnbindCameraResponsePacket::class.java)

        listeners[player.uniqueId]?.invoke(packet)
        listeners.remove(player.uniqueId)
    }
}

