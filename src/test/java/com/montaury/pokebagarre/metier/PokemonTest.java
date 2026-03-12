package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void pokemon1_devrait_gagner_car_attaque_superieur() {
        //GIVEN
        Stats s1 = new Stats(38000,0);
        Pokemon p1 = new Pokemon("absoluteDestroyer","random",s1);
        Stats s2 = new Stats(0,0);
        Pokemon p2 = new Pokemon("absoluteNoob","random",s2);

        //WHEN
        boolean gagnerP1 = p1.estVainqueurContre(p2);
        //THEN
        assertThat(gagnerP1).isEqualTo(true);
    }

    @Test
    void pokemon1_devrait_perdre_car_attaque_inferieur() {
        //GIVEN
        Stats s1 = new Stats(0,0);
        Pokemon p1 = new Pokemon("absoluteDestroyer","random",s1);
        Stats s2 = new Stats(38000,0);
        Pokemon p2 = new Pokemon("absoluteNoob","random",s2);
        //WHEN
        boolean gagnerP1 = p1.estVainqueurContre(p2);
        //THEN
        assertThat(gagnerP1).isEqualTo(false);
    }

    @Test
    void pokemon1_devrait_gagner_car_defense_superieur() {
        //GIVEN
        Stats s1 = new Stats(38000,10);
        Pokemon p1 = new Pokemon("absoluteDestroyer","random",s1);
        Stats s2 = new Stats(38000,0);
        Pokemon p2 = new Pokemon("absoluteNoob","random",s2);
        //WHEN
        boolean gagnerP1 = p1.estVainqueurContre(p2);
        //THEN
        assertThat(gagnerP1).isEqualTo(true);
    }

    @Test
    void pokemon1_devrait_perdre_car_defense_inferieur() {
        //GIVEN
        Stats s1 = new Stats(38000,0);
        Pokemon p1 = new Pokemon("absoluteDestroyer","random",s1);
        Stats s2 = new Stats(38000,38000);
        Pokemon p2 = new Pokemon("absoluteNoob","random",s2);
        //WHEN
        boolean gagnerP1 = p1.estVainqueurContre(p2);
        //THEN
        assertThat(gagnerP1).isEqualTo(false);
    }

    @Test
    void pokemon1_devrait_gagner_car_premier_pokemon() {
        //GIVEN
        Stats s1 = new Stats(38000,38000);
        Pokemon p1 = new Pokemon("absoluteDestroyer","random",s1);
        Stats s2 = new Stats(38000,38000);
        Pokemon p2 = new Pokemon("absoluteNoob","random",s2);
        //WHEN
        boolean gagnerP1 = p1.estVainqueurContre(p2);
        //THEN
        assertThat(gagnerP1).isEqualTo(true);
    }


}