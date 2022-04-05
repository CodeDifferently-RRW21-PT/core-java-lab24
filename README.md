# Lab 23 

## Ol' McBaron Had a Farm

* **Objective:** To implement a system representative of a Farm environment
* **Purpose:** To demonstrate [multi-inheritence design issues](https://www.geeksforgeeks.org/java-and-multiple-inheritance/)
* **Prerequesites:** A `UML` approved by an instructor.


# Part 1: Setting the Plot...

Consider a system in which:

* An interface `Eater`
  * has a method called `eat` which accepts a `Edible` object.
* An interface `NoiseMaker` 
  * has a method called `makeNoise` which returns a string representing a sound.
* An interface `Rideable` that has two methods
  * `mount` which accepts a `Rider` object
  * `unmount` which returns a `Rider` object
* An interface `Produce` 
  * which has a method called `yield` which will return a `Eddible` object
* An abstract class called `Edible`
* An abstract `Animal` is a `NoiseMaker` and `Eater`
    * `Horse` is an `Animal` and `Rideable`
    * `Chicken` is an `Animal` and a `Produce` which `yield` an `EdibleEgg` if `hasBeenFertilized` flag is `false`.
* An abstract class `Rider` object.

# Part 2: Setting the Plot...

* Interface `Vehicle` is a `NoiseMaker` and `Rideable`
    * `FarmVehicle` can `operate` on a `Farm`
        * `Tractor` is a `FarmVehicle` which can `harvest` a `Crop`.
    * `Aircraft` are `Vehicle` which can  `fly`
        * `CropDuster` is a `FarmVehicle` and `Aircraft` which can `fertilize` a `CropRow`
* `Person` can `makeNoise` and can `eat` an `Edible` object.
* `Farmer` is an `Eater`, a `Rider`, a `Botanist`, and a `Person`.
* `Stable` stores many `Horse`.
* `FarmHouse` stores many `Person`
* `ChickenCoop` stores many `Chicken`
* `Farm` stores many `Stable`, many `ChickenCoop`, and a single `FarmHouse`





