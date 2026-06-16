package view.cli;

import model.game.entity.Plant;
import view.api.PlantSelectionView;

import java.util.List;

public class PlantSelectionViewCli extends CliView implements PlantSelectionView {
    // show all plants command
    public void showAllPlants(List<Plant> plants) {
        // TODO: implement after the Plant class is done.
    }

    // show available plants command
    public void showAvailablePlants(List<Plant> plants) {
        // TODO: implement after the Plant class is done.
    }

    // add plant command errors
    // and remove plant command errors
    public void errorPlantNotFound() {
        displayError("Could not find this plant.");
    }

    public void errorPlantAlreadySelected() {
        displayError("This plant is already selected.");
    }

    public void errorPlantNotSelected() {
        displayError("This plant is not selected.");
    }

    public void showGameStarted() {
        displayMessage("The Game Started!");
    }
}
