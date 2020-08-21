# meta-commands

A set of commands that can be used to run any command with additional behaviour.

## Install

1. Head over to the [releases](../../releases) section and download the latest version
2. Drag the file into the `plugins` directory of your server
3. Restart or reload the server
4. Done!

## Use

### Delay

The `delay` command runs a command after waiting a specified amount of ticks.

For example: `delay 200 say I will be run after 10 seconds` (20 ticks ~ 1 second)

### Chance

The `chance` command runs a command or doesn't, depending on the outcome of a random decision with the specified chance.

For example: `chance 50.5 say I will be run 50.5% of the times you run this command`

### Permissions

Each command has an own permission that is required to run it. So far there is `metacmd.chance` and `metacmd.delay`.
