package fr.jordanlambert.maxylabyrinthe.elements;

import android.graphics.Color;

/**
 * Created by jordan on 10/04/2017.
 */

public class Boule {
    // Rayon de la boule
    public static final int RAYON = 10;

    // Ma boule sera verte
    private int mCouleur = Color.GREEN;

    // Position ignorée au démarrage
    private float mX;
    private float mY;

    // Vitesse nulle au début
    private float mSpeedX = 0;
    private float mSpeedY = 0;

    // Vitesse max de la boule
    private static final float MAX_SPEED = 20.0f;
}
