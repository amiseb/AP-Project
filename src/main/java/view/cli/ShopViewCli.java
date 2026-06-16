package view.cli;

import view.api.ShopView;

public class ShopViewCli extends CliView implements ShopView {
    // shop list command
    public void showShopList() {
        // TODO: implement after the Shop is done.
    }

    // shop daily command
    public void showDailyOffer() {
        // TODO: implement after the Shop is done.
    }

    // shop buy command - success
    public void showItemPurchased(String itemName, int count, String extraInfo) {
        // TODO: change after the Shop is done.
        String msg = "Successfully purchased " + count + " " + itemName;
        if (extraInfo != null && !extraInfo.isEmpty()) {
            msg += " (" + extraInfo + ")";
        }
        displayMessage(msg + ".");
    }

    // ====================== ERROR METHODS ======================

    public void errorInsufficientCoins() {
        displayError("You don't have enough coins.");
    }

    public void errorInsufficientDiamonds() {
        displayError("You don't have enough diamonds.");
    }

    public void errorItemNotFound(String itemId) {
        displayError("Item '" + itemId + "' not found in shop.");
    }

    public void errorDailyOfferAlreadyPurchased() {
        displayError("You have already purchased today's daily offer.");
    }

    public void errorMaxCapacityReached(String itemName) {
        displayError("You have reached the maximum capacity for " + itemName + ".");
    }

    public void errorPlantTypeRequired() {
        displayError("Plant type (-t) is required for selective seed packets.");
    }

    public void errorPlantNotUnlocked(String plantType) {
        displayError("Plant " + plantType + " is not unlocked yet.");
    }

    public void errorInvalidBuyCount() {
        displayError("Invalid purchase count.");
    }

    public void errorInvalidShopCommand() {
        displayError("Invalid shop command or parameters.");
    }
}