package fr.jordanlambert.maxylabyrinthe.elements;

/**
 * Created by jordan on 10/04/2017.
 */

public class Bloc {

    enum Type {TROU, DEBUT, FIN};

    private float SIZE = Boule.RAYON * 2;

    private float mX;
    private float mY;

    private Type mType = null;

}
