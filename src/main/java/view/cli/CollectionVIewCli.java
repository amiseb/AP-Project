package view.cli;

import model.game.entity.Plant;
import model.game.entity.Zombie;
import view.api.CollectionView;

import java.util.List;

public class CollectionVIewCli extends CliView implements CollectionView {
    // collection show-plant command
    public void showPlant(Plant plant) {
        // TODO: implement after the Plant class is done.
    }

    // collection show-plants command
    public void showPlants(List<Plant> plants) {
        // TODO: implement after the Plant class is done.
    }

    // collection show-all-plants command
    public void showAllPlants(List<Plant> plants) {
        // TODO: implement after the Plant class is done.
    }

    // collection show-zombie command
    public void showZombie(Zombie zombie) {
        // TODO: implement after the Zombie class is done.
    }

    // collection show-zombies command
    public void showZombies(List<Zombie> zombies) {
        // TODO: implement after the Zombie class is done.
    }

    // collection show-all-zombies command
    public void showAllZombies(List<Zombie> zombies) {
        // TODO: implement after the Zombie class is done.
    }

    // collection upgrade-plant
    public void errorNotEnoughSeedCoinForUpgrade() {
        displayError("You don't have enough coins to upgrade.");
    }

    public void errorNotEnoughForUpgrade() {
        displayError("You don't have enough seed packets to upgrade.");
    }

    // collection purchase-plant
    public void errorNotEnoughSeedCoinToPurchase() {
        displayError("You don't have enough coins to purchase.");
    }
}
