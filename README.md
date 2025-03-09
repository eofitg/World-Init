# World-Init

WorldInit is a lightweight Minecraft plugin that automatically applies predefined **gamerule** settings to every world when it loads.

### Configuration
Modify the `config.yml` file to set default **gamerules** for all worlds:

```yaml
gamerules:
  commandBlockOutput: true
  doDaylightCycle: false
  doEntityDrops: false
  doFireTick: false
  doMobLoot: false
  doMobSpawning: false
  doTileDrops: true
  keepInventory: false
  logAdminCommands: true
  mobGriefing: false
  naturalRegeneration: true
  randomTickSpeed: 3
  reducedDebugInfo: false
  sendCommandFeedback: true
  showDeathMessage: true
```

### Notes
This plugin will override any `gamerule` settings set by `MyWorlds` or similar world management plugins.
