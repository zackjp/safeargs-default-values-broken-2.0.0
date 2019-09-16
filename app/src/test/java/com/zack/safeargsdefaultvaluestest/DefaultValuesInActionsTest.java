package com.zack.safeargsdefaultvaluestest;

import androidx.navigation.NavController;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DefaultValuesInActionsTest {

    /*
     * On safe-args:2.0.0 will fail on:
     * java.lang.NullPointerException
     * 	at com.zack.safeargsdefaultvaluestest.Screen1FragmentDirections$ActionScreen1ToScreen2.getMyBoolean(Screen1FragmentDirections.java:52)
     * 	at com.zack.safeargsdefaultvaluestest.Screen1FragmentDirections$ActionScreen1ToScreen2.equals(Screen1FragmentDirections.java:67)
     */
    @Test
    public void defaultValuesInActionsShouldWork() {
        final NavController navController = mock(NavController.class);
        final DefaultValuesInActions defaultValuesInActions = new DefaultValuesInActions(navController);

        defaultValuesInActions.doTheNavigation();

        verify(navController).navigate(Screen1FragmentDirections.actionScreen1ToScreen2());
    }

}