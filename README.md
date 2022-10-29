android_App_test
# Miniteste1_app

## Objective of the app

An APP to let workers of restaurants to find the ingredients of certain meals, and the meals of certain menus

The user needs to be able to:
 - Insert the information necessary of a plate and add it to a Menu
 - Know the number of plates inserted on a Menu
 - The plate with the highest difficulty to make
 - Plate with the highest number of ingridients
 
 <sub> Might add more funcionality in the future </sub>
## To do this is necessary the following classes:

### RESTAURANT
 
 Parameters:
 - name (string)
 - localization (string)
 - Array of MENUS
 
 Constructors:
 - constructor with name
 - constructor with name and localization
 
 Functions:
 - get name 
 - get localization 
 - set localization 
 - add a menu
 - remove a menu
 - mumber of menus


### MENU
 Parameters:
 - name (string)
 - Array of PLATES
 
 Constructors:
 - constructor with name
 
 Functions:
 - add a plate 
 - remove a plate 
 - number of plates 
 - plate with the highest number of ingridients
 

### PRATO (Plate)

 Parameters:
 - name (string)
 - array of ingridients
 - cooking time (double)
 - difficulty level (int)
 - instructions (string)
 
 Constructors:
 - constructor with name
 - constructor with name and cooking time
 
 Functions:
 - get name
 - get cooking time
 - set cooking time
 - add ingridients
 - remove ingridients
 - set instructions



## Progress

### DAY 1 (day of the exam)

 Made the classes:
- RESTAURANTE 
- EMENTA
- INGREDIENTES 

Started working on the design of the app but didn't had time to finish
 
### DAY 2

Added:
- ADD meal 
- View number of meals
- Tried to have it working with two activities but wasn't able to make it work


### DAY 3





