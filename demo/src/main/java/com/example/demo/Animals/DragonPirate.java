package com.example.demo.Animals;

import com.example.demo.Config;

/**
 * Dragon class
 * @author Maliha Tariq
 */

public class DragonPirate extends Animal{
    public DragonPirate(int count) {
        super(Config.ANIMAL_IMAGE_IMAGE_PATH_PREFIX_MAPPINGS.get(AnimalType.DRAGON_PIRATE), count);
    }

}
