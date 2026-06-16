package view.cli;

import model.game.entity.Plant;
import model.game.entity.Zombie;
import model.item.Sun;
import view.api.GamePlayView;

import java.util.List;

public class GamePlayViewCli extends CliView implements GamePlayView {

    // advance time command
    public void showAdvanceTime(int ticks) {
        displayMessage("The game advanced " + ticks + " tick(s).");
    }

    // sun produced command
    public void showSunProduced(Plant plant, int x, int y) {
        // TODO: implement after the Plant class is done.
        // displayMessage("plant " + plant.getType() + " produced a sun at (" + x + ", " + y + ")");
    }

    // sun dropped command
    public void showSunDropped(Sun sun, int x, int y) {
        // TODO: implement after the Sun class is done.
        // displayMessage("New " + /* sun type */ " sun is dropping at position (" + x + ", " + y + ")");
    }

    // sun reached ground command
    public void showSunReachedGround(int x, int y) {
        displayMessage("Sun reached the ground at position (" + x + ", " + y + ")");
    }

    // show sun amount command
    public void showSunAmount(int amount) {
        displayMessage("You have " + amount + " sun(s).");
    }

    // cheat add suns command
    public void showCheatAddedSuns(int suns) {
        displayMessage("CHEAT: You got " + suns + " sun(s).");
    }

    // plant planted command
    public void showPlantPlanted(String plantType, int x, int y) {
        displayMessage("Planted " + plantType + " at (" + x + ", " + y + ")");
    }

    // plant plucked command
    public void showPlantPlucked(int x, int y) {
        displayMessage("Plucked plant at (" + x + ", " + y + ")");
    }

    // plant destroyed command
    public void showPlantDestroyed(Plant plant, int x, int y) {
        // TODO: implement after the Plant class is done.
        // displayMessage("Plant " + plant.getType() + " at (" + x + ", " + y + ") is destroyed.");
    }

    // lawn mower triggered command
    public void showLawnMowerTriggered(int row) {
        displayMessage("The lawn mower in the row " + row + " is triggered and killed these zombies:");
    }

    // lawn mower failed command
    public void showLawnMowerFailed(int row) {
        displayMessage("The zombie ate your brain; LOSER!!!");
    }

    // wave started command
    public void showWaveStarted(int waveNumber) {
        displayMessage("Wave " + waveNumber + " started.");
    }

    // final wave command
    public void showFinalWave() {
        displayMessage("The final wave has come.");
    }

    // zombie spawned command
    public void showZombieSpawned(String zombieType, int wave, int lane, int cost) {
        displayMessage("Zombie " + zombieType + " spawned at wave " + wave + " in lane " + lane + " which costed " + cost + ".");
    }

    // zombie died command
    public void showZombieDied(String zombieType, double x, double y) {
        displayMessage("Zombie of type " + zombieType + " is dead at (" + String.format("%.1f", x) + ", " + (int) y + ")");
    }

    // nuke cheat command
    public void showNukeActivated() {
        displayMessage("CHEAT: Nuke released! All zombies have been destroyed.");
    }

    // remove cooldown cheat command
    public void showCheatCooldownRemoved() {
        displayMessage("CHEAT: All plant cooldowns have been removed.");
    }

    // glowing zombie drop food command
    public void showGlowingZombieDroppedFood(int currentFoods) {
        displayMessage("The glowing zombie dropped a plant food; you have " + currentFoods + " plant foods now.");
    }

    // feed plant command
    public void showPlantFed(int x, int y) {
        displayMessage("Fed plant at (" + x + ", " + y + ")");
    }

    // cheat add plant food command
    public void showCheatAddedPlantFood() {
        displayMessage("CHEAT: Added one plant food.");
    }

    // win message command
    public void showWinMessage() {
        displayMessage("Dear humanz, zis is not done yet; we will come back to eat your brainz, humanz.");
    }

    // show map command
    public void showMap(String mapRepresentation) {
        System.out.println(mapRepresentation);
    }

    // show plants status command
    public void showPlantsStatus(String status) {
        System.out.println(status);
    }

    // show tile status command
    public void showTileStatus(String tileInfo) {
        System.out.println(tileInfo);
    }

    // item dropped command
    public void showItemDropped(String itemType, int count) {
        String plural = (count > 1) ? "s" : "";
        displayMessage("A zombie dropped a " + itemType + "; you have " + count + " " + itemType + plural + " now.");
    }

    // zombies info command
    public void showZombiesInfo(List<Zombie> zombies) {
        // TODO: implement after the Zombie class is done.
    }

    // cheat spawn-zombie command
    public void showCheatSpawnZombie(String zombieType, int x, int y) {
        displayMessage("Zombie of type " + zombieType + " is spawned at (" + String.format("%.1f", x) + ", " + (int) y + ")");
    }

    // ====================== ERROR METHODS ======================

    // plant selection errors
    public void errorPlantNotSelected(String type) {
        displayError("Plant " + type + " has not been selected for this level.");
    }

    public void errorPlantAlreadySelected(String type) {
        displayError("Plant " + type + " is already selected.");
    }

    public void errorPlantLocked(String type) {
        displayError("Plant " + type + " is locked.");
    }

    public void errorPlantNotFound(String type) {
        displayError("Plant " + type + " does not exist.");
    }

    public void errorNoPlantToRemove(String type) {
        displayError("Plant " + type + " is not selected to be removed.");
    }

    // planting errors
    public void errorNotEnoughSun() {
        displayError("You don't have enough sun to plant this.");
    }

    public void errorInvalidLocation(int x, int y) {
        displayError("Invalid location (" + x + ", " + y + ").");
    }

    public void errorCannotPlantHere(int x, int y) {
        displayError("You cannot plant here at (" + x + ", " + y + ").");
    }

    public void errorPlantOnCooldown(String type) {
        displayError("Plant " + type + " is on cooldown.");
    }

    // plucking errors
    public void errorNoPlantToPluck(int x, int y) {
        displayError("There is no plant to pluck at (" + x + ", " + y + ").");
    }

    // plant food errors
    public void errorNoPlantFood() {
        displayError("You don't have any plant food left.");
    }

    public void errorCannotFeedHere(int x, int y) {
        displayError("There is no plant to feed at (" + x + ", " + y + ").");
    }

    // boost errors
    public void errorCannotBoostPlant(String type) {
        displayError("Cannot boost plant " + type + ".");
    }

    public void errorNotEnoughDiamonds() {
        displayError("You don't have enough diamonds to boost this plant.");
    }

    // general errors
    public void errorInvalidCommand() {
        displayError("Invalid command or parameters.");
    }

    public void errorGameNotStarted() {
        displayError("Please start the game first using 'start game'.");
    }
}