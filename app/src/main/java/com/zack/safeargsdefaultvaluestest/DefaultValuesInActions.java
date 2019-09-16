package com.zack.safeargsdefaultvaluestest;

import androidx.navigation.NavController;

public class DefaultValuesInActions {

    private final NavController navController;

    public DefaultValuesInActions(NavController navController) {
        this.navController = navController;
    }

    public void doTheNavigation() {
        navController.navigate(Screen1FragmentDirections.actionScreen1ToScreen2());
    }
}
