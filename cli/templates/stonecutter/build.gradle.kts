import gg.meza.stonecraft.mod

plugins {
    id("gg.meza.stonecraft")
{{#kotlin}}
    kotlin("jvm")
{{/kotlin}}
}

modSettings {
    clientOptions {
        narrator = false
    }
    // NeoForge 26.3 deprecates logoFile in favour of iconFile (square) / bannerFile.
    variableReplacements.put("logoKey", if (stonecutter.eval(mod.minecraftVersion, ">=26.3")) "iconFile" else "logoFile")
}
