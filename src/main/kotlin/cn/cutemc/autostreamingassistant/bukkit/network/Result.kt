package cn.cutemc.autostreamingassistant.bukkit.network

enum class UnbindResult {
    CLIENT_NOT_RESPONDING,
    CAMERA_PLAYER_NOT_ONLINE,
    NOT_BOUND_CAMERA,
    SUCCESS;

    override fun toString(): String {
        return this.name.lowercase()
    }

    fun fromString(string: String): UnbindResult {
        return UnbindResult.valueOf(string.uppercase())
    }
}

enum class BindResult {
    CLIENT_NOT_RESPONDING,
    CAMERA_PLAYER_NOT_ONLINE,
    NO_OTHER_PLAYERS,
    NOT_FOUND_PLAYER,
    NOT_AT_NEAR_BY,
    WORLD_IS_NULL,
    PLAYER_IS_NULL,
    UNSUPPORTED_GAME_MODE,
    SUCCESS;

    override fun toString(): String {
        return this.name.lowercase()
    }

    fun fromString(string: String): BindResult {
        return BindResult.valueOf(string.uppercase())
    }
}

enum class ClientStatus {

    READY,
    BOUND;

    override fun toString(): String {
        return this.name.lowercase()
    }

    fun fromString(string: String): ClientStatus {
        return ClientStatus.valueOf(string.uppercase())
    }
}